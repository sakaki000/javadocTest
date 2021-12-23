package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

/**
 * @deprecated 古い仕様なので、アクセスがなくなったら削除予定。
 */
@Deprecated(forRemoval = true)
public class SampleController {

    /***
     * @param in test 
     * @param out test
     * @return String test
     */
    public String get(String in, String out) {
        return "Hello";
    }

    /**
    *  コメントの説明文
    *  @return String test
    */
    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
