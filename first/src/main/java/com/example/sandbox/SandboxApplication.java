package com.example.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

	/**
	*  コメントの説明文
        *  @param String fromTopic
	*  @deprecated デプリケイテッド１
	*/
	@Deprecated
	public static void main(String[] args) {
		System.out.println("a");
		SpringApplication.run(SandboxApplication.class, args);
	}

	/**
	*  コメントの説明文
        *  @return String fromTopic
	*  @deprecated デプリケイテッド２
	*/
	@Deprecated(forRemoval=true)
	public String out() {
		return "dep";
	}
}
