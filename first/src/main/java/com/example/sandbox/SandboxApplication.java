package com.example.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		System.out.println("a");
		SpringApplication.run(SandboxApplication.class, args);
	}

	/**
	*  コメントの説明文
        *  @return String fromTopic
        * @deprecated 古い仕様なので、アクセスがなくなったら削除予定。最新仕様は {@link IResumeCorrectionStrategy IResumeCorrectionStrategy}。
        */
        @Deprecated(forRemoval = true)
	public String out() {
		return "dep";
	}
}
