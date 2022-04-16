package com.uniminuto.document.management.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniminuto.document.management.models.GdDepartamento;
import com.uniminuto.document.management.repositories.DepartmentRepository;
import com.uniminuto.document.management.services.DepartmentService;

@Service
public class ImplDepartment implements DepartmentService {

	
	@Autowired
	private DepartmentRepository oDepartmentRepository;
	
	@Override
	public GdDepartamento create(GdDepartamento deparment) {		
		return oDepartmentRepository.save(deparment);
	}

}
