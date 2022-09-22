package com.cts.ecart.service;

import java.util.List;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;

public interface ProductService {
	
	Product saveProduct(Product product);

	List<Product> findAllProducts();

	List<Brand> findAllBrands();

	List<Category> findAllCategories();

	Product findById(int id);

	Brand findByBrandId(int id);

	Category findBycategoryId(int id);

	List<Product> findByProductPriceGreaterThanEqual(double price);

	List<Product> findByProductTitleLike(String name);

	List<Product> findByBrand_BrandTitleEquals(String brandName);

	List<Product> findByCategory_CatTitle(String catgoryName);

	List<Product> listAll();

	List<Product> findByName(String productName);

	void saveBrand(int id, String name);

}
