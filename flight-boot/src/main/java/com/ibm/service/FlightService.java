package com.ibm.service;

import java.util.List;

import com.ibm.entity.Flight;

public interface FlightService {
	
		int save(Flight f);

		Flight fetch(int code);

		List<Flight> list();

		boolean remove(int code);

		boolean update(Flight f);
	
}
