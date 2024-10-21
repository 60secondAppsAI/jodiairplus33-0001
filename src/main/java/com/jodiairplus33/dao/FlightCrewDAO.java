package com.jodiairplus33.dao;

import java.util.List;

import com.jodiairplus33.dao.GenericDAO;
import com.jodiairplus33.domain.FlightCrew;





public interface FlightCrewDAO extends GenericDAO<FlightCrew, Integer> {
  
	List<FlightCrew> findAll();
	






}


