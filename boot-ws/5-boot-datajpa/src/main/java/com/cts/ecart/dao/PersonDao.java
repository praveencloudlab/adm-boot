package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{}

