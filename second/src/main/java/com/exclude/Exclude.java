package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in develop1
     * @param out develop1
     * @return String develop1
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String develop1
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
