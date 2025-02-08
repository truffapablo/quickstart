package com.devpablo.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
		System.out.println("DATABASE_URL: " + System.getenv("DATABASE_URL"));
		System.out.println("DATABASE_USER: " + System.getenv("DATABASE_USER"));
		System.out.println("DATABASE_PASSWORD: " + System.getenv("DATABASE_PASSWORD"));

		SpringApplication.run(QuickstartApplication.class, args);
	}

}