package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in testJavadocGenerarte2 
     * @param out testJavadocGenerarte2
     * @return String testJavadocGenerarte2
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String testJavadocGenerarte2
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
