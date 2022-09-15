package com.cts.patient.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.patient.entity.Patient;

public interface PatientDao extends JpaRepository<Patient, Integer>{

}
