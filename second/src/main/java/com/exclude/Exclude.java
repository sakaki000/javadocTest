package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in master
     * @param out master
     * @return String master
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    * @return String master
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
