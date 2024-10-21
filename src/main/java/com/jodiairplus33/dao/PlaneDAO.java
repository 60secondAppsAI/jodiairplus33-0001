package com.jodiairplus33.dao;

import java.util.List;

import com.jodiairplus33.dao.GenericDAO;
import com.jodiairplus33.domain.Plane;





public interface PlaneDAO extends GenericDAO<Plane, Integer> {
  
	List<Plane> findAll();
	






}


