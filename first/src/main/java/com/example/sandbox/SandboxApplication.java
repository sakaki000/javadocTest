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
	* @return String topic_staging2_update_push
	*/
	public String out() {
		return "dep";
	}
}
