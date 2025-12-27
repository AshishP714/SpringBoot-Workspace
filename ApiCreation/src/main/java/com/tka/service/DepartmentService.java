package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Department;
import com.tka.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
 	public DepartmentRepository repository;
	
	public String addDepartment(Department department) {
		repository.save(department);
		return "Department added successfully";
	}
}
