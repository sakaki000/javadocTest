package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {


    /***
     * @param in input
     * @param out output 
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
