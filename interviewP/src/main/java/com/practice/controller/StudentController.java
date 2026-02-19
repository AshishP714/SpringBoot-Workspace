package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.entity.Student;
import com.practice.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return studentService.message;
	}

	@GetMapping("get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {
		ResponseEntity<Student> student = studentService.getStudent(id).map(ResponseEntity::ok)
				.orElseThrow();
		return student;
	}
}
