package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class ContentController {
	//http://localhost:8880/text/venkat
	@GetMapping(value = "text/{name}", produces = "text/plain" )
	public String greetText(@PathVariable String name) {
		return "Welcome to SpringBoot ," + name;
	}
	//http://localhost:8880/html?name=venkat
	@GetMapping(value="/html", produces="text/html")
	public String greetHtml(@RequestParam String name) {
		return "<h1>Welcome to SpringBoot,"+name; 
	}
	//http://localhost:8880/xml
	@GetMapping(value="/xml", produces="text/xml")
	public String greetXml(){
		return "<?xml version=\"1.0\"?><greeting>Welcome to SpringBoot</greeting>"; 
	}
	//http://localhost:8880/json
	@GetMapping(value="/json", produces="application/json")
	public String greetJson(){
		JSONPObject obj=new JSONPObject("greeting","welcome to SpringBoot");
		return obj.getValue().toString(); 
	}
}
