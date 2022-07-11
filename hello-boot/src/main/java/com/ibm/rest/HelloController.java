package com.ibm.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/hello") //https://localhost:8880/hello
	public String sayHello() {
		return "Hello SpringBoot";
	}
	@PostMapping(value = "/hello")
	public String sayPostHello() {
		return "POST: Hello SpringBoot";
	}
	@PutMapping(value = "/hello")
	public String sayPutHello() {
		return "PUT: Hello SpringBoot";
	}
	@DeleteMapping(value = "/hello")
	public String sayDeleteHello() {
		return "Delte: Hello SpringBoot";
	}
}
