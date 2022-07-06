package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
