package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param out topic_develop3_not_work
     * @return String topic_develop3_not_work
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
