package com.cts.ecart.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.cts.ecart.dao.utils.ProductStoreDB;
import com.cts.ecart.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public Product save(Product product) {
		System.out.println(">>> ProductDaoImpl::save");
		
		//ProductStoreDB.getProducts().forEach(prod->System.out.println(prod));
		ProductStoreDB.getProducts().add(product);
		
		return product;
	}

	@Override
	public Product findById(int id) {
		System.out.println(">>> ProductDaoImpl::findById");
		 return ProductStoreDB.getProducts().stream().filter(product->product.getId()==id).findAny().orElse(null);
	}

	@Override
	public List<Product> findAll() {
		System.out.println(">>> ProductDaoImpl::findAll");
		return ProductStoreDB.getProducts();
	}

}
