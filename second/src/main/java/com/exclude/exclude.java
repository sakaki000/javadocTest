package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in plus_main
     * @param out output
     * @return String String
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String String
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
