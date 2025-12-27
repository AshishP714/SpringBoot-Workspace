package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService service;
	
	@PostMapping("/add-Employee")
	public String addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return "Employee inserted";
	}
	
	@PutMapping("/update-Employee")
	public String updateEmployee(@RequestBody Employee employee, Integer id) {
		service.addEmployee(employee);
		return "Data updated";
	}
}