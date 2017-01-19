package getword.orchid.com.myapplication.bean;

import java.util.List;


public class bean {


    /**
     * msg : SUCCESS
     * status_code : 0
     * data : {"pronunciations":{"uk":"ɡʊd","us":"ɡʊd"},"en_definitions":{"adv":["(often used as a combining form) in
     * a good or proper or satisfactory manner or to a high standard (`good' is a nonstandard dialectal variant for
     * `well')","completely and absolutely (`good' is sometimes used informally for `thoroughly')"],"adj":["having
     * desirable or positive qualities especially those suitable for a thing specified","morally admirable","having
     * the normally expected amount","deserving of esteem and respect","promoting or enhancing well-being"],
     * "n":["benefit","moral excellence or admirableness","that which is pleasing or valuable or useful"]},
     * "audio_addresses":{"uk":["https://media-audio1.baydn.com/uk%2Fg%2Fgo%2Fgood.mp3","http://media-audio1.qiniu
     * .baydn.com/uk/g/go/good.mp3"],"us":["https://media-audio1.baydn.com/us%2Fg%2Fgo%2Fgood.mp3",
     * "http://media-audio1.qiniu.baydn.com/us/g/go/good.mp3"]},"uk_audio":"http://media.shanbay.com/audio/uk/good
     * .mp3","conent_id":2953,"audio_name":"good","cn_definition":{"pos":"","defn":"n. 善行,好处\nadj. 好的,优良的,上等的\n[pl
     * .]商品"},"num_sense":1,"content_type":"vocabulary","sense_id":0,"id":2953,"definition":" n. 善行,好处\nadj. 好的,优良的,
     * 上等的\n[pl.]商品","content_id":2953,"url":"https://www.shanbay.com/bdc/mobile/preview/word?word=good",
     * "has_audio":true,"en_definition":{"pos":"adv","defn":"(often used as a combining form) in a good or proper or
     * satisfactory manner or to a high standard (`good' is a nonstandard dialectal variant for `well'); completely
     * and absolutely (`good' is sometimes used informally for `thoroughly')"},"object_id":2953,"content":"good",
     * "pron":"ɡʊd","pronunciation":"ɡʊd","audio":"http://media.shanbay.com/audio/us/good.mp3",
     * "us_audio":"http://media.shanbay.com/audio/us/good.mp3"}
     */

    private String   msg;
    private int      status_code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * pronunciations : {"uk":"ɡʊd","us":"ɡʊd"}
         * en_definitions : {"adv":["(often used as a combining form) in a good or proper or satisfactory manner or
         * to a high standard (`good' is a nonstandard dialectal variant for `well')","completely and absolutely
         * (`good' is sometimes used informally for `thoroughly')"],"adj":["having desirable or positive qualities
         * especially those suitable for a thing specified","morally admirable","having the normally expected
         * amount","deserving of esteem and respect","promoting or enhancing well-being"],"n":["benefit","moral
         * excellence or admirableness","that which is pleasing or valuable or useful"]}
         * audio_addresses : {"uk":["https://media-audio1.baydn.com/uk%2Fg%2Fgo%2Fgood.mp3","http://media-audio1
         * .qiniu.baydn.com/uk/g/go/good.mp3"],"us":["https://media-audio1.baydn.com/us%2Fg%2Fgo%2Fgood.mp3",
         * "http://media-audio1.qiniu.baydn.com/us/g/go/good.mp3"]}
         * uk_audio : http://media.shanbay.com/audio/uk/good.mp3
         * conent_id : 2953
         * audio_name : good
         * cn_definition : {"pos":"","defn":"n. 善行,好处\nadj. 好的,优良的,上等的\n[pl.]商品"}
         * num_sense : 1
         * content_type : vocabulary
         * sense_id : 0
         * id : 2953
         * definition :  n. 善行,好处
         adj. 好的,优良的,上等的
         [pl.]商品
         * content_id : 2953
         * url : https://www.shanbay.com/bdc/mobile/preview/word?word=good
         * has_audio : true
         * en_definition : {"pos":"adv","defn":"(often used as a combining form) in a good or proper or satisfactory
         * manner or to a high standard (`good' is a nonstandard dialectal variant for `well'); completely and
         * absolutely (`good' is sometimes used informally for `thoroughly')"}
         * object_id : 2953
         * content : good
         * pron : ɡʊd
         * pronunciation : ɡʊd
         * audio : http://media.shanbay.com/audio/us/good.mp3
         * us_audio : http://media.shanbay.com/audio/us/good.mp3
         */

        private PronunciationsBean pronunciations;
        private EnDefinitionsBean  en_definitions;
        private AudioAddressesBean audio_addresses;
        private String             uk_audio;
        private int                conent_id;
        private String             audio_name;
        private CnDefinitionBean   cn_definition;
        private int                num_sense;
        private String             content_type;
        private int                sense_id;
        private int                id;
        private String             definition;
        private int                content_id;
        private String             url;
        private boolean            has_audio;
        private EnDefinitionBean   en_definition;
        private int                object_id;
        private String             content;
        private String             pron;
        private String             pronunciation;
        private String             audio;
        private String             us_audio;

        public PronunciationsBean getPronunciations() {
            return pronunciations;
        }

        public void setPronunciations(PronunciationsBean pronunciations) {
            this.pronunciations = pronunciations;
        }

        public EnDefinitionsBean getEn_definitions() {
            return en_definitions;
        }

        public void setEn_definitions(EnDefinitionsBean en_definitions) {
            this.en_definitions = en_definitions;
        }

        public AudioAddressesBean getAudio_addresses() {
            return audio_addresses;
        }

        public void setAudio_addresses(AudioAddressesBean audio_addresses) {
            this.audio_addresses = audio_addresses;
        }

        public String getUk_audio() {
            return uk_audio;
        }

        public void setUk_audio(String uk_audio) {
            this.uk_audio = uk_audio;
        }

        public int getConent_id() {
            return conent_id;
        }

        public void setConent_id(int conent_id) {
            this.conent_id = conent_id;
        }

        public String getAudio_name() {
            return audio_name;
        }

        public void setAudio_name(String audio_name) {
            this.audio_name = audio_name;
        }

        public CnDefinitionBean getCn_definition() {
            return cn_definition;
        }

        public void setCn_definition(CnDefinitionBean cn_definition) {
            this.cn_definition = cn_definition;
        }

        public int getNum_sense() {
            return num_sense;
        }

        public void setNum_sense(int num_sense) {
            this.num_sense = num_sense;
        }

        public String getContent_type() {
            return content_type;
        }

        public void setContent_type(String content_type) {
            this.content_type = content_type;
        }

        public int getSense_id() {
            return sense_id;
        }

        public void setSense_id(int sense_id) {
            this.sense_id = sense_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDefinition() {
            return definition;
        }

        public void setDefinition(String definition) {
            this.definition = definition;
        }

        public int getContent_id() {
            return content_id;
        }

        public void setContent_id(int content_id) {
            this.content_id = content_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isHas_audio() {
            return has_audio;
        }

        public void setHas_audio(boolean has_audio) {
            this.has_audio = has_audio;
        }

        public EnDefinitionBean getEn_definition() {
            return en_definition;
        }

        public void setEn_definition(EnDefinitionBean en_definition) {
            this.en_definition = en_definition;
        }

        public int getObject_id() {
            return object_id;
        }

        public void setObject_id(int object_id) {
            this.object_id = object_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPron() {
            return pron;
        }

        public void setPron(String pron) {
            this.pron = pron;
        }

        public String getPronunciation() {
            return pronunciation;
        }

        public void setPronunciation(String pronunciation) {
            this.pronunciation = pronunciation;
        }

        public String getAudio() {
            return audio;
        }

        public void setAudio(String audio) {
            this.audio = audio;
        }

        public String getUs_audio() {
            return us_audio;
        }

        public void setUs_audio(String us_audio) {
            this.us_audio = us_audio;
        }

        public static class PronunciationsBean {
            /**
             * uk : ɡʊd
             * us : ɡʊd
             */

            private String uk;
            private String us;

            public String getUk() {
                return uk;
            }

            public void setUk(String uk) {
                this.uk = uk;
            }

            public String getUs() {
                return us;
            }

            public void setUs(String us) {
                this.us = us;
            }
        }

        public static class EnDefinitionsBean {
            private List<String> adv;
            private List<String> adj;
            private List<String> n;

            public List<String> getAdv() {
                return adv;
            }

            public void setAdv(List<String> adv) {
                this.adv = adv;
            }

            public List<String> getAdj() {
                return adj;
            }

            public void setAdj(List<String> adj) {
                this.adj = adj;
            }

            public List<String> getN() {
                return n;
            }

            public void setN(List<String> n) {
                this.n = n;
            }
        }

        public static class AudioAddressesBean {
            private List<String> uk;
            private List<String> us;

            public List<String> getUk() {
                return uk;
            }

            public void setUk(List<String> uk) {
                this.uk = uk;
            }

            public List<String> getUs() {
                return us;
            }

            public void setUs(List<String> us) {
                this.us = us;
            }
        }

        public static class CnDefinitionBean {
            /**
             * pos :
             * defn : n. 善行,好处
             adj. 好的,优良的,上等的
             [pl.]商品
             */

            private String pos;
            private String defn;

            public String getPos() {
                return pos;
            }

            public void setPos(String pos) {
                this.pos = pos;
            }

            public String getDefn() {
                return defn;
            }

            public void setDefn(String defn) {
                this.defn = defn;
            }
        }

        public static class EnDefinitionBean {
            /**
             * pos : adv
             * defn : (often used as a combining form) in a good or proper or satisfactory manner or to a high standard (`good' is a nonstandard dialectal variant for `well'); completely and absolutely (`good' is sometimes used informally for `thoroughly')
             */

            private String pos;
            private String defn;

            public String getPos() {
                return pos;
            }

            public void setPos(String pos) {
                this.pos = pos;
            }

            public String getDefn() {
                return defn;
            }

            public void setDefn(String defn) {
                this.defn = defn;
            }
        }
    }
}
