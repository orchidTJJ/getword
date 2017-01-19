package getword.orchid.com.myapplication.view;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Utils {

    private static List<Character> sPunctuations;

    static {
        Character[] arr = new Character[]{',', '.', ';', '!', '"', '，', '。', '！', '；', '、', '：', '“', '”','?','？'};
        sPunctuations = Arrays.asList(arr);
    }

    static boolean isChinese(char ch) {
        return !sPunctuations.contains(ch);
    }

    @NonNull
    static List<WordInfo> getEnglishWordIndices(String content) {
        List<Integer> separatorIndices = getSeparatorIndices(content, ' ');//去除开头空格,然后将剩下的英文内容转化为集合
        for (Character punctuation : sPunctuations) {
            separatorIndices.addAll(getSeparatorIndices(content, punctuation));
        }
        Collections.sort(separatorIndices);
        List<WordInfo> wordInfoList = new ArrayList<>();
        int start = 0;
        int end;
        for (int i = 0; i < separatorIndices.size(); i++) {//判定买一个单词是从哪一个开始哪一个结束
            end = separatorIndices.get(i);
            if (start == end) {
                start++;
            } else {
                WordInfo wordInfo = new WordInfo();
                wordInfo.setStart(start);
                wordInfo.setEnd(end);
                wordInfoList.add(wordInfo);
                start = end + 1;
            }
        }
        return wordInfoList;
    }

    /**
     * 获取每一个字,转化成集合
     *
     * @param word the content
     * @param ch   separate char
     * @return index array
     */
    private static List<Integer> getSeparatorIndices(String word, char ch) {
        int pos = word.indexOf(ch);
        List<Integer> indices = new ArrayList<>();
        while (pos != -1) {
            indices.add(pos);
            pos = word.indexOf(ch, pos + 1);
        }
        return indices;
    }
}
