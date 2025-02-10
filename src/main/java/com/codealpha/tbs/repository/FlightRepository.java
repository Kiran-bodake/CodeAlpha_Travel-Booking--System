package com.codealpha.tbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codealpha.tbs.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
