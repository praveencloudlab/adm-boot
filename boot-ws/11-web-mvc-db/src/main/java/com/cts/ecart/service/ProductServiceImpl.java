package com.cts.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.BrandDao;
import com.cts.ecart.dao.CategoryDao;
import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	@Autowired
	private BrandDao brandDao;
	@Autowired
	private CategoryDao categoryDao;

	public List<Product> findAllProducts() {
		return productDao.findAll();
	}

	public List<Brand> findAllBrands() {
		return brandDao.findAll();
	}

	public List<Category> findAllCategories() {
		return categoryDao.findAll();
	}

	public Product findById(int id) {
		return productDao.findById(id).orElse(null);
	}

	public Brand findByBrandId(int id) {
		return brandDao.findById(id).orElse(null);
	}

	public Category findBycategoryId(int id) {
		return categoryDao.findById(id).orElse(null);
	}

	@Override
	public List<Product> findByProductPriceGreaterThanEqual(double price) {
		// TODO Auto-generated method stub
		return productDao.findByProductPriceGreaterThanEqual(price);
	}

	@Override
	public List<Product> findByProductTitleLike(String name) {
		// TODO Auto-generated method stub
		return productDao.findByProductTitleLike(name);
	}

	@Override
	public List<Product> findByBrand_BrandTitleEquals(String brandName) {
		// TODO Auto-generated method stub
		return productDao.findByBrand_BrandTitleEquals(brandName);
	}

	@Override
	public List<Product> findByCategory_CatTitle(String catgoryName) {
		// TODO Auto-generated method stub
		return productDao.findByCategory_CatTitle(catgoryName);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return productDao.listAll();
	}

	@Override
	public List<Product> findByName(String productName) {
		// TODO Auto-generated method stub
		return productDao.findByName(productName);
	}

	@Override
	public void saveBrand(int id, String name) {
		brandDao.saveBrand(id, name);
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.save(product);
	}

}
