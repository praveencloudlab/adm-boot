package com.cts.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.employee.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {}
