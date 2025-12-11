package com.tka.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	 int patientId;
	 int patientAge;
	 String patientDecies;
	 String patientCity;
	 String patientGender;

	public Patient() {
		super();
	}

	public Patient(int patientId, int patientAge, String patientDecies, String patientCity, String patientGender) {
		super();
		this.patientId = patientId;
		this.patientAge = patientAge;
		this.patientDecies = patientDecies;
		this.patientCity = patientCity;
		this.patientGender = patientGender;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientDecies() {
		return patientDecies;
	}

	public void setPatientDecies(String patientDecies) {
		this.patientDecies = patientDecies;
	}

	public String getPatientCity() {
		return patientCity;
	}

	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientAge=" + patientAge + ", patientDecies=" + patientDecies
				+ ", patientCity=" + patientCity + ", patientGender=" + patientGender + "]";
	}
}