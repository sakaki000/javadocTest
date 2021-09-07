package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in topic_staging1
     * @param out topic_staging1
     * @return String topic_staging1
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    * @return String topic_staging1
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
