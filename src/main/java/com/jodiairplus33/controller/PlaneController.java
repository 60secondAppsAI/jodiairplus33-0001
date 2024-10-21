package com.jodiairplus33.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.jodiairplus33.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.jodiairplus33.domain.Plane;
import com.jodiairplus33.dto.PlaneDTO;
import com.jodiairplus33.dto.PlaneSearchDTO;
import com.jodiairplus33.dto.PlanePageDTO;
import com.jodiairplus33.service.PlaneService;
import com.jodiairplus33.dto.common.RequestDTO;
import com.jodiairplus33.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/plane")
@RestController
public class PlaneController {

	private final static Logger logger = LoggerFactory.getLogger(PlaneController.class);

	@Autowired
	PlaneService planeService;



	//@AllowSystem(AuthScopes.READ)
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Plane> getAll() {

		List<Plane> planes = planeService.findAll();
		
		return planes;	
	}

	//@ReadAccess
	@GetMapping(value = "/{planeId}")
	@ResponseBody
	public PlaneDTO getPlane(@PathVariable Integer planeId) {
		
		return (planeService.getPlaneDTOById(planeId));
	}

 	//@WriteAccess
 	@RequestMapping(value = "/addPlane", method = RequestMethod.POST)
	public ResponseEntity<?> addPlane(@RequestBody PlaneDTO planeDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = planeService.addPlane(planeDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}
		
		return result.asResponseEntity();
	}

	//@ReadAccess
	@GetMapping("/planes")
	public ResponseEntity<PlanePageDTO> getPlanes(PlaneSearchDTO planeSearchDTO) {
 
		return planeService.getPlanes(planeSearchDTO);
	}	

 	//@WriteAccess
	@RequestMapping(value = "/updatePlane", method = RequestMethod.POST)
	public ResponseEntity<?> updatePlane(@RequestBody PlaneDTO planeDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = planeService.updatePlane(planeDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
