package com.example.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplicationChangeName {

	public static void main(String[] args) {
		System.out.println("a");
		SpringApplication.run(SandboxApplicationChangeName.class, args);
	}

	/**
	*  コメントの説明文
        *  @return String testtest
	*/
	public String out() {
		return "dep";
	}
}
