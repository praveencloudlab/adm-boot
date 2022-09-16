package com.cts.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	// DSL => domain-specific language 
	
	//list all products whose price is greater than 12000?
	
	List<Product> findByProductPriceGreaterThanEqual(double price);
	// list all product for given product name
	List<Product> findByProductTitleLike(String name);
	
	// list all products whose brand name is samsung
	
	List<Product> findByBrand_BrandTitleEquals(String brandName);
	
	

}
