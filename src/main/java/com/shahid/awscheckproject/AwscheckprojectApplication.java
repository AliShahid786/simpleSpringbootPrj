package com.shahid.awscheckproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwscheckprojectApplication {
	@GetMapping("/")
	public String home(){
		return "you did it";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwscheckprojectApplication.class, args);
	}

}
