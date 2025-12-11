package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PatientDao;
import com.tka.entities.Patient;

@Service
public class PatientService {
	
	@Autowired
	PatientDao dao;

	public String insertPatient(Patient p) {
		String masg = dao.insertPatient(p);
		return masg;
	}
}
