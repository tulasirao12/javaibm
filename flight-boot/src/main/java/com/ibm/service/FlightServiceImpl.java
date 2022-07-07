package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightRepository repo;
	@Override
	public int save(Flight f) {
		repo.save(f);
		return f.getCode();
	}

	@Override
	public Flight fetch(int code) {
		
		return repo.findById(code).get();
	}

	@Override
	public List<Flight> list() {
		
		return repo.findAll();
	}

	@Override
	public boolean remove(int code) {
		repo.deleteById(code);
		return true;
	}

	@Override
	public boolean update(Flight f) {
		repo.save(f);
		return false;
	}

	@Override
	public List<Flight> byCarrier(String carrier) {
		
		return repo.findByCarrier(carrier);
	}

	@Override
	public List<Flight> byRoute(String source, String destination) {
		
		return repo.findByRoute(source, destination);
	}

	
	
}
