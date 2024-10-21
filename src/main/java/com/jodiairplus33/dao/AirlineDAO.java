package com.jodiairplus33.dao;

import java.util.List;

import com.jodiairplus33.dao.GenericDAO;
import com.jodiairplus33.domain.Airline;





public interface AirlineDAO extends GenericDAO<Airline, Integer> {
  
	List<Airline> findAll();
	






}


