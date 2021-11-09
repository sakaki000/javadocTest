package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in topic_branch_topic
     * @param out topic_branch_topic
     * @return String topic_branch_topic
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @return String topic_branch_topic
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
