package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Department;
import com.tka.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	public DepartmentService service;
	
	@PostMapping("/add-department")
	public String addDepartment(@RequestBody Department department) {
		if (department != null) {
			service.addDepartment(department);
			return "Department added...";
		} else {
			return "Department is not added...";
		}
	}
}