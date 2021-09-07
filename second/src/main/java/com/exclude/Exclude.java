package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in topic2
     * @param out topic2
     * @return String topic2
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    * @return String topic2_update
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
