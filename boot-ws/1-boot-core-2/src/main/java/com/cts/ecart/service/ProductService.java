package com.cts.ecart.service;

import java.util.List;

import com.cts.ecart.entity.Product;

public interface ProductService {
	
	Product save(Product product);

	Product findById(int id);

	List<Product> findAll();

}
