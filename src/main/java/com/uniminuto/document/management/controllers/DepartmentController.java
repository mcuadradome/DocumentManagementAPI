package com.uniminuto.document.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniminuto.document.management.models.GdDepartamento;
import com.uniminuto.document.management.services.DepartmentService;


@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping()
    public GdDepartamento saveUser(@RequestBody GdDepartamento u){
          return departmentService.create(u);
    }
	
	
}
