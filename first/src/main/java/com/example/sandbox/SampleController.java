package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in PR_TEST
     * @param out PR_TEST
     * @return String PR_TEST
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String PR_TEST
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
