package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class StringAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringAssignmentApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Client! How are you doing?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings!!";
	}
}
