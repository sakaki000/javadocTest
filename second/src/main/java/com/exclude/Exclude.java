package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in NotWork_pr
     * @param out NotWork
     * @return String NotWork
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String main_copy2
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
