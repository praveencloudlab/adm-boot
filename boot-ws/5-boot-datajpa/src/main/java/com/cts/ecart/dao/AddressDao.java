package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {}
