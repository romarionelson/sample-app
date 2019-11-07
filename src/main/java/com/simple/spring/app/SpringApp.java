package com.simple.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}

}
