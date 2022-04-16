package com.uniminuto.document.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniminuto.document.management.models.GdDepartamento;

@Repository
public interface DepartmentRepository extends JpaRepository<GdDepartamento, Integer > {

	
	
	
	
}
