package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer> {

}
