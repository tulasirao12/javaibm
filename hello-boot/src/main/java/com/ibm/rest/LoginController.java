package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping(value="/login", produces ="text/html")
	public String validate(@RequestParam  String username, @RequestParam  String password) {
		if(username.equals("scott")&&password.equals("tiger"))
			return "login successful";
		else
			return "login failure";
	}
}
