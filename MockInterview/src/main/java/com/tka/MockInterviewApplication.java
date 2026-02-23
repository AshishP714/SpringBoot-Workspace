package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockInterviewApplication.class, args);
		System.err.println("Application is started");
	}
}