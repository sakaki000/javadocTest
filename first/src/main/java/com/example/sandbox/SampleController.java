package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in main_copy3
     * @param out main_copy3
     * @return String main_copy3
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String main_copy3
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
