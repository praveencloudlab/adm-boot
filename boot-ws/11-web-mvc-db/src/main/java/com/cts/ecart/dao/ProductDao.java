package com.cts.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.entity.Product;
public interface ProductDao extends JpaRepository<Product, Integer>{
	
	
	
	// DSL => domain-specific language 
	
	//list all products whose price is greater than 12000?
	
	List<Product> findByProductPriceGreaterThanEqual(double price);
	// list all product for given product name
	List<Product> findByProductTitleLike(String name);
	
	// list all products whose brand name is samsung
	List<Product> findByBrand_BrandTitleEquals(String brandName);
	
	// list all  products of mobile category
	List<Product> findByCategory_CatTitle(String catgoryName);
	
	
	// custom methods using @Query
	
	@Query(name = "q1",value = "from com.cts.ecart.entity.Product")
	List<Product> listAll();
	
	
	// find products matching with given product title
	
	//@Query(name = "q2",value = "from com.cts.ecart.entity.Product p where p.productTitle like :productName")
	//List<Product> findByName(String productName);
	
	// JPQL
	
	@Query(name = "q2",value = "from com.cts.ecart.entity.Product p where p.productTitle like :name")
	List<Product> findByName(@Param("name") String productName);
	
	
	
	
	
	
	
	
	
	

}
