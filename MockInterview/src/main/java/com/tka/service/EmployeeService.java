package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Employee;
import com.tka.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee inserted";
	}

	public List<Employee> allEmployee() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	public void updateEmployee(Long id, Employee employee) {
		Employee existing = employeeRepository.findById(id).orElseThrow(null);
		if (existing != null) {
			existing.setName(employee.getName());
			existing.setEmail(employee.getEmail());
			existing.setCity(employee.getCity());
		} else {
			System.out.println("Id not found");
		}
		employeeRepository.save(employee);
	}
	
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Employee deleted";
	}
}