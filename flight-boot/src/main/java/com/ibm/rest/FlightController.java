package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Flight;
import com.ibm.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	private FlightService service;
	@PostMapping(value ="/add", consumes ="application/json")
	public String save(@RequestBody Flight f) {
		int code = service.save(f);
		return "Flight added with code:" +code;
	}
	
	@GetMapping(value = "/get/{code}", produces = "application/json")
	public Flight ftech(int code) {
		return service.fetch(code);
	}

	@GetMapping(value = "/list", produces = "application/json")
	public List<Flight> list() {
		return service.list();
	}
}
