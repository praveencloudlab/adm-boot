package com.cts.patient.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.patient.entity.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Integer>{

}
