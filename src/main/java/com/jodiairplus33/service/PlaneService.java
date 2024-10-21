package com.jodiairplus33.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiairplus33.domain.Plane;
import com.jodiairplus33.dto.PlaneDTO;
import com.jodiairplus33.dto.PlaneSearchDTO;
import com.jodiairplus33.dto.PlanePageDTO;
import com.jodiairplus33.dto.PlaneConvertCriteriaDTO;
import com.jodiairplus33.service.GenericService;
import com.jodiairplus33.dto.common.RequestDTO;
import com.jodiairplus33.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PlaneService extends GenericService<Plane, Integer> {

	List<Plane> findAll();

	ResultDTO addPlane(PlaneDTO planeDTO, RequestDTO requestDTO);

	ResultDTO updatePlane(PlaneDTO planeDTO, RequestDTO requestDTO);

    Page<Plane> getAllPlanes(Pageable pageable);

    Page<Plane> getAllPlanes(Specification<Plane> spec, Pageable pageable);

	ResponseEntity<PlanePageDTO> getPlanes(PlaneSearchDTO planeSearchDTO);
	
	List<PlaneDTO> convertPlanesToPlaneDTOs(List<Plane> planes, PlaneConvertCriteriaDTO convertCriteria);

	PlaneDTO getPlaneDTOById(Integer planeId);







}





