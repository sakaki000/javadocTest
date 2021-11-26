package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in changeText 
     * @param out changeText
     * @return String changeText
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String changeText
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
