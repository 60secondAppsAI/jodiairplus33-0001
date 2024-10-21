package com.jodiairplus33.dao;

import java.util.List;

import com.jodiairplus33.dao.GenericDAO;
import com.jodiairplus33.domain.Flight;





public interface FlightDAO extends GenericDAO<Flight, Integer> {
  
	List<Flight> findAll();
	






}


