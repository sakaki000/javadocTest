package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in testJavadocGenerarte 
     * @param out testJavadocGenerarte
     * @return String testJavadocGenerarte
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String testJavadocGenerarte
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
