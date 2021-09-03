package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {


    /***
     * @param in PR_TEST_NOT_WORK
     * @param out PR_TEST_NOT_WORK
     * @return String PR_TEST_NOT_WORK
     */
    public String get(String in, String out) {
        return "Hello";
    }


    /**
    *  コメントの説明文
    *  @deprecated 別のメソッドに置き換えられました
    *  @return String PR_TEST_NOT_WORK
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
