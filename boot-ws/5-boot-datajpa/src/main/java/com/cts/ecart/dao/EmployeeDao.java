package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{}
