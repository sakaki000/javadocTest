package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in staging4
     * @param out staging4
     * @return String staging4
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    * @return String staging4
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
