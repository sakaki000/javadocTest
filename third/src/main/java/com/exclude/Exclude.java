package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in main_copy2
     * @param out main_copy2
     * @return String main_copy2
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String main_copy2
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
