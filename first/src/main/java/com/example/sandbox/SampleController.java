package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in not_merge
     * @param out not_merge
     * @return String not_merge
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String Work
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
