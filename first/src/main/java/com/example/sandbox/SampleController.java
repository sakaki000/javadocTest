package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in workflow_test
     * @param out workflow_test
     * @return String workflow_test
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String workflow_test
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
