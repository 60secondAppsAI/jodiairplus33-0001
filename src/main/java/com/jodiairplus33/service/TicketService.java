package com.jodiairplus33.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiairplus33.domain.Ticket;
import com.jodiairplus33.dto.TicketDTO;
import com.jodiairplus33.dto.TicketSearchDTO;
import com.jodiairplus33.dto.TicketPageDTO;
import com.jodiairplus33.dto.TicketConvertCriteriaDTO;
import com.jodiairplus33.service.GenericService;
import com.jodiairplus33.dto.common.RequestDTO;
import com.jodiairplus33.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface TicketService extends GenericService<Ticket, Integer> {

	List<Ticket> findAll();

	ResultDTO addTicket(TicketDTO ticketDTO, RequestDTO requestDTO);

	ResultDTO updateTicket(TicketDTO ticketDTO, RequestDTO requestDTO);

    Page<Ticket> getAllTickets(Pageable pageable);

    Page<Ticket> getAllTickets(Specification<Ticket> spec, Pageable pageable);

	ResponseEntity<TicketPageDTO> getTickets(TicketSearchDTO ticketSearchDTO);
	
	List<TicketDTO> convertTicketsToTicketDTOs(List<Ticket> tickets, TicketConvertCriteriaDTO convertCriteria);

	TicketDTO getTicketDTOById(Integer ticketId);







}





