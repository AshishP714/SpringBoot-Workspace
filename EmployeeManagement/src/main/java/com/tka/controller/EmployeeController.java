package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/save")
	public String insertEmployee(@RequestBody Employee employee) {
		service.insertEmployee(employee);
		return "Data updated...";
	} 
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		service.updateEmployee(employee);
		return "Data inserted...";
	} 
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
		return "Data inserted...";
	} 
	
	@GetMapping("/show")
	public List<Employee> showAllEmployee() {
		return service.showAllEmployee();
	} 
	
	@GetMapping("/get/{id}")
	public Employee showByIdEmployee(@PathVariable int id) {
		return service.showByIdEmployee(id);
	} 
}