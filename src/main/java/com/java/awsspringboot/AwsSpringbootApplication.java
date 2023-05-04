package com.java.awsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsSpringbootApplication {
@GetMapping("/")
	public String home(){
		return "Welcome to Aws-Spring-Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsSpringbootApplication.class, args);
	}

}
