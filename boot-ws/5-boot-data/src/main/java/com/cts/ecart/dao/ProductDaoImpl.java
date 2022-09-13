package com.cts.ecart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.entity.Product;

@Repository
public class ProductDaoImpl {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Product> findAll(){
		return em.createQuery("from Product").getResultList();
	}
	
	@Transactional
	public Product save(Product product) {
		em.persist(product);
		return product;
	}
	
	public Product findById(int id) {
		return em.find(Product.class, id);
	}
	
	@Transactional
	public Product update(Product product) {
		return em.merge(product);
	}
	
	
	@Transactional
	public void delete(Product prod) {
		em.remove(em.contains(prod) ? prod : em.merge(prod));	
	}
	
	
	
	
	
	
	

}
