package com.practice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Student;
import com.practice.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public String message = "Data has inserted";
	
	//Add Student
	public String addStudent(Student student) {
		if (student != null) {
			studentRepository.save(student);
			return message;
		} else {
			message = "Data has not inserted";
			return message;
		}
	}
	
	//put
	public Optional<Student> getStudent(Long id) {
		 Optional<Student> student = studentRepository.findById(id);
		 return student;
	}
}