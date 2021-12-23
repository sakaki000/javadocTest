package com.example.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		SampleController sample = new SampleController();
		SpringApplication.run(SandboxApplication.class, args);
	}

	/**
	*  コメントの説明文
        *  @return String commentTest
        *  @deprecated 古い仕様なので、アクセスがなくなったら削除予定。
        */
        @Deprecated
	public String out() {
		return "dep";
	}
}
