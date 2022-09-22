package com.cts.ecart.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.entity.Brand;
//@Transactional(isolation = Isolation.DEFAULT,propagation =Propagation.MANDATORY )
public interface BrandDao extends JpaRepository<Brand, Integer> {
	
	
	// QUERY
	 @Modifying(clearAutomatically = true)
	 @Query(nativeQuery = true, name = "q1",value = "insert into brands (brand_id,brand_title) values(?1,?2)")
	 void saveBrand(int id,String name);
	 
	// @Transactional(isolation = Isolation.READ_COMMITTED)
	// @Query(name = "q2",value = "from com.cts.ecart.entity.Brand")
	 //List<Brand> listAllBrands();
	 

}
