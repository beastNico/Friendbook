package com.wia1002g3.friendbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FriendbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendbookApplication.class, args);
	}

	@GetMapping("/test")
	public String hello(){
		return "hello world";
	}

}
