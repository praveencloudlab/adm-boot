package com.cts.ecart.dao;

import java.util.List;

import com.cts.ecart.entity.Product;

public interface ProductDao {

	Product save(Product product);

	Product findById(int id);

	List<Product> findAll();

}