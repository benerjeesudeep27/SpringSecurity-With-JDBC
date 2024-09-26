package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityWithJDBCController {

	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Morining";
	}
	@GetMapping("/user")
	public String getUserMsg() {
		return "Welcome User - How are your ?";
	}
	@GetMapping("/admin")
	public String getAdminMsg() {
		return "Welcome Admin - What's Up ?";
	}
	@GetMapping("/")
	public String getGeneralMsg() {
		return "Welcome to Spring Secrity With JDBC";
	}
}
