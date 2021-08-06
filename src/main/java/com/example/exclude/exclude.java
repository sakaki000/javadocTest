package com.example.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class exclude {


    /***
     * @param in input
     * @param out output 
     * @return test
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
     * @return test
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
