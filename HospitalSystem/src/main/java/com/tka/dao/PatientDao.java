package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.Patient;

@Repository
public class PatientDao {

	@Autowired
	SessionFactory factory;

	public String insertPatient(Patient p) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.persist(p);
		tr.commit();
		session.close();
		return "Data inserted...";
	}
}