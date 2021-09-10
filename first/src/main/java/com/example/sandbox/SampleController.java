package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in topic1
     * @param out topic1
     * @return String topic1
     * @throws RuntimeException
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String topic1
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
