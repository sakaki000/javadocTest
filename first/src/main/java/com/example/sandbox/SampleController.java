package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in actionDo2
     * @param out actionDo
     * @return String actionDo
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String actionDo
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
