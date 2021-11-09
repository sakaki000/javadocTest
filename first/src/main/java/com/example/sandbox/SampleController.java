package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in test_javadoc2 
     * @param out test_javadoc2
     * @return String test_javadoc2
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String test_javadoc2
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
