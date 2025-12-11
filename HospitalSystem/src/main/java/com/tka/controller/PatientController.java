package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entities.Patient;
import com.tka.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService service;
	
	@PostMapping("/register")
	public String insertPatient(@RequestBody Patient p) {
		String masg = service.insertPatient(p); 
		return masg;
	}
}