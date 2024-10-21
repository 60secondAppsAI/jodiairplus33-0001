package com.jodiairplus33.dao;

import java.util.List;

import com.jodiairplus33.dao.GenericDAO;
import com.jodiairplus33.domain.Ticket;





public interface TicketDAO extends GenericDAO<Ticket, Integer> {
  
	List<Ticket> findAll();
	






}


