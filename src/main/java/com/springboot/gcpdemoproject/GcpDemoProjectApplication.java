package com.springboot.gcpdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcpDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpDemoProjectApplication.class, args);
	}
	
	@GetMapping(path = "/")
	public String hello() {
		return "Welcome to GCP World";
	}
	
	@GetMapping(path = "/user/{user}")
	public String getUser(@PathVariable String user) {
		user = user!=null ? user : "User";
		return "Hello "+user;
	}

}
