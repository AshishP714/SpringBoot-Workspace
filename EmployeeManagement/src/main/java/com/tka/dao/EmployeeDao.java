package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}