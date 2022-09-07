package com.cts.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao prodDao;

	@Override
	public Product save(Product product) {
		System.out.println(">>> ProductServiceImpl::save ");
		return prodDao.save(product);
	}

	@Override
	public Product findById(int id) {
		System.out.println(">>> ProductServiceImpl::findById ");
		return prodDao.findById(id);
	}

	@Override
	public List<Product> findAll() {
		System.out.println(">>> ProductServiceImpl::findAll ");
		return prodDao.findAll();
	}
	

}
