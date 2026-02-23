package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public String addEmloyee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee inserted";
	}
	
	@GetMapping("/all")
	public List<Employee> allEmployee() {
		return employeeService.allEmployee();
	}
	
	@GetMapping("get/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
		employeeService.updateEmployee(id, emp);
	}
	
	@DeleteMapping("delete/{id}")
	public String deteleEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted";
	}
}
