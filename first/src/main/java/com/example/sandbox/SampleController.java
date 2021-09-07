package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in main
     * @param out main
     * @return String main
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String workflow_test
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
