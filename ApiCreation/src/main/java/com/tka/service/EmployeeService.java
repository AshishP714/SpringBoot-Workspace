package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Department;
import com.tka.entity.Employee;
import com.tka.repository.DepartmentRepository;
import com.tka.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository repository;

	@Autowired
	public DepartmentRepository drepository;

	public String message = "Employee details inserted";

	public String addEmployee(Employee employee) {

		Integer depid = employee.getDepartment().getId();

		Department depart = null;

		if (drepository.findById(depid).isPresent()) {
			depart = drepository.findById(depid).get();
		} else {
			return "Department not found...";
		}

		employee.setDepartment(depart);
		repository.save(employee);
		return message;
	}

	public String updateEmployee(Employee employee, Integer id) {
		if (id != null) {
			employee.getEmployeeName();
			employee.getEmployeeEmail();
			employee.getEmployeePhone();
			employee.getEmployeeSalary();
			employee.getPassword();
			repository.save(employee);
			return "Data updated";
		} else {
			return "Data is not updated";
		}
	}
}