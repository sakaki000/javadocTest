package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in main
     * @param out main
     * @return String main
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String main_copy6
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
