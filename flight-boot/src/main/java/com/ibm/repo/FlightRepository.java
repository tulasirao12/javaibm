package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
	List<Flight> findByCarrier(String carrier);
	
	//List<Flight> findBySourceAndDestination(String source, String destination);
	
	
	@Query("From Flight WHERE source=:src AND destination=:dest")
	List<Flight> findByRoute(String src,String dest);
}
