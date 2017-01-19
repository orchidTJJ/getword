package getword.orchid.com.myapplication;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.IOException;
import java.lang.reflect.Type;

import getword.orchid.com.myapplication.bean.bean;
import getword.orchid.com.myapplication.view.GetWordTextView;
import okhttp3.Call;

public class MainActivity extends AppCompatActivity  {

    private GetWordTextView mEnglishGetWordTextView;
    public static final String URL = "https://api.shanbay.com/bdc/search/?word=";

    private String text_info = "KIEV — The European Union warned Ukraine on Thursday time was running out to revive " +
            "shelved deals on free trade and political association by meeting the bloc's concerns over the jailing of" +
            " opposition leader Yulia Tymoshenko and bringing in reforms.\n" +
            "\n" +
            "A senior EU official also made it clear the agreements would fall through if Ukraine\n" +
            "\n" +
            "joined the Russia-led post-Soviet Customs Union trade bloc. \"We have a window of opportunity. But time " +
            "is short,'' Stefan Fuele, the European Commissioner for Enlargement and European Neighbourhood Policy, " +
            "said on a visit to Ukraine.\n" +
            "\n" +
            "Brussels put off signing the landmark agreements after a Ukrainian court jailed former prime minister " +
            "Tymoshenko, President Viktor Yanukovich's main opponent, on an abuse-of-office charge in October 2011.\n" +
            "\n" +
            "The EU says the Tymoshenko case and those of other prosecuted opposition politicians are examples of " +
            "selective justice and are a barrier to Ukraine's ambition of European integration.\n" +
            "\n" +
            "Two other issues raised by the bloc are related to the electoral system, which came under fire from " +
            "Western observers following the parliamentary election in October, and legal reforms needed to bring " +
            "Ukraine closer to EU standards.\n" +
            "\n" +
            "\"The European Union is committed to signing the association agreement...provided there is determined " +
            "action and tangible progress on the three key issues: selective justice, addressing the shortcomings of " +
            "the October election and advancing the association agenda reforms,'' Fuele told reporters. \"After " +
            "several recent setbacks in Ukraine there is a need to regain confidence that Ukraine could emerge as a " +
            "modern European country.''\n" +
            "\n" +
            "Fuele, whose visit may set the tone of a Feb. 25 EU-Ukraine summit, said the two agreements could be " +
            "signed at the EU's Eastern Partnership summit in November if the former Soviet republic met the bloc's " +
            "conditions.\n" +
            "\n" +
            "But he warned the Kiev government that joining a customs union with Russia, aggressively promoted by " +
            "Moscow, would ruin those prospects.\n" +
            "\n" +
            "\"Joining any structure which would imply transferring the ability to set tariffs and define its trade " +
            "policy to a supranational body would mean that Ukraine would no longer be able to implement the tariff " +
            "dismantling agreed with the European Union in the context of the DCFTA [Deep and Comprehensive Free " +
            "Trade Agreement],'' Fuele said in a speech at the Ukrainian parliament.\n" +
            "\n" +
            "\"It would also not be able anymore to regulate areas such as food standards, or technical product " +
            "standards, all of them important in the framework of the DCFTA. It will not be able to integrate " +
            "economically with the European Union,\" he continued.\n" +
            "\n" +
            "Ukrainian officials say they are committed to European integration. But they say they are also looking " +
            "for a way to cooperate with the Customs Union because both blocs are Ukraine's major trade partners.\n" +
            "\n" +
            "Fuele urged Ukraine to make sure it adopts and implements laws that actually work and adhere to European" +
            " standards, citing as an example the law on state procurement - purchases of goods and services by the " +
            "government.\n" +
            "\n" +
            "The EU suspended some of its Ukraine financial aid programs after Kiev adopted a law on state " +
            "procurement which Brussels said was riddled with loopholes and thus failed to ensure transparent and " +
            "competitive procedures.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEnglishGetWordTextView = (GetWordTextView) findViewById(R.id.english_get_word_text_view);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.activity_main);
        mEnglishGetWordTextView.setText(text_info);
        mEnglishGetWordTextView.setOnWordClickListener(new GetWordTextView.OnWordClickListener() {
            @Override
            public void onClick(final String word) {
                //网络请求 TODO: 2016/12/18
                OkHttpUtils
                        .get()
                        .url(URL + word.trim())
                        .build()
                        .execute(new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                showToast("网络错误");
                                return;

                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Gson gson = new Gson();
                                Type objectType = new TypeToken<bean>() {}.getType();
                                final bean result = gson.fromJson(response, objectType);
                                if (result.getStatus_code() == 1) {

                                    Snackbar make = Snackbar.make(findViewById(android.R.id.content), result.getMsg(), Snackbar.LENGTH_INDEFINITE);
                                    SnackbarUtil.setSnackbarColor(make, Color.WHITE, Color.RED);
                                    make.show();

                                    return;
                                }

                                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "", Snackbar.LENGTH_INDEFINITE);
                                View snackbarview = snackbar.getView();
                                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarview;
                                View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(R.layout.snackbar_addview, null);//加载布局文件新建View


                                TextView tv_word = (TextView) add_view.findViewById(R.id.tv_word);
                                TextView tv_phonogram = (TextView) add_view.findViewById(R.id.tv_phonogram);
                                TextView tv_info_usa = (TextView) add_view.findViewById(R.id.tv_info_usa);
                                TextView tv_info_uk = (TextView) add_view.findViewById(R.id.tv_info_uk);

                                tv_word.setText(word);
                                tv_phonogram.setText(result.getData().getCn_definition().getDefn());
                                tv_info_usa.setText("美:[" + result.getData().getPronunciations().getUs() + "]");
                                tv_info_uk.setText("英:[" + result.getData().getPronunciations().getUk() + "]");


                                add_view.findViewById(R.id.iv_usa).setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        MediaPlayer mediaPlayer = new MediaPlayer();
                                        stopMedia(mediaPlayer);
                                        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);// 设置媒体流类型
                                        try {
                                            mediaPlayer.setDataSource(result.getData().getUs_audio());
                                            mediaPlayer.prepareAsync();//异步的准备
                                            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                                                @Override
                                                public void onPrepared(MediaPlayer mp) {
                                                    mp.start();
                                                }
                                            });

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }

                                    }
                                });

                                add_view.findViewById(R.id.iv_uk).setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        MediaPlayer mediaPlayer = new MediaPlayer();
                                        stopMedia(mediaPlayer);

                                        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);// 设置媒体流类型
                                        try {
                                            mediaPlayer.setDataSource(result.getData().getUk_audio());
                                            mediaPlayer.prepareAsync();//异步的准备
                                            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                                                @Override
                                                public void onPrepared(MediaPlayer mp) {
                                                    mp.start();

                                                }
                                            });
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                });


                                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);//设置新建布局参数

                                p.gravity = Gravity.CENTER_VERTICAL;//设置新建布局在Snackbar内垂直居中显示

                                snackbarLayout.addView(add_view, 0, p);

                                snackbar.show();

                            }
                        });
            }
        });


    }

    /**
     * 使用完MediaPlayer需要回收资源。MediaPlayer是很消耗系统资源的，所以在使用完MediaPlayer，不要等待系统自动回收，最好是主动回收资源。
     */
    private void stopMedia(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

    }

    Toast toast;

    public void showToast(String msg) {
        if (toast == null) {
            toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
        }
        toast.setText(msg);
        toast.show();
    }

}
