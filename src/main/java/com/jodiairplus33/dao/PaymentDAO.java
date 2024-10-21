package com.jodiairplus33.dao;

import java.util.List;

import com.jodiairplus33.dao.GenericDAO;
import com.jodiairplus33.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


