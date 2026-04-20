package com.easy.StuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easy.Dto.StudentDTO;

import com.easy.StuService.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	public StudentController() {
	    System.out.println("CONTROLLER LOADED");
	}
	 @Autowired
	    private StudentService service;
	
	 @PostMapping("/register")
	 public ResponseEntity<String> register( @Valid @RequestBody StudentDTO student)
	 
	 {
		
		 service.register(student);
		 
		    return ResponseEntity.ok("User registered successfully");
		     
		     
	 }

}
