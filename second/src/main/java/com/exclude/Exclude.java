package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in NotWork
     * @param out NotWork
     * @return String NotWork
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String NotWork
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
