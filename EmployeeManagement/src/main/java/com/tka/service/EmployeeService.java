package com.tka.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public final String message = "Value not exist...";

	// Insert data
	public Employee insertEmployee(Employee employee) {
		return dao.save(employee);
	}

	// Update data
	public Employee updateEmployee(Employee employee) {
		return dao.save(employee);
	}

	// Delete data
	public void deleteEmployee(int id) {
		dao.deleteById(id);
	}

	// Show all data
	public List<Employee> showAllEmployee() {
		return dao.findAll();
	}
	
	// Show_By_Id
	public Employee showByIdEmployee(int id) {
		return dao.getById(id);
		
	}
}