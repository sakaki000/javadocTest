package com.example.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class exclude {


    /***
     * @param in ActionNotWork
     * @param out output
     * @return String String
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    * @return String String
    * @deprecated 別のメソッドに置き換えられました
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
