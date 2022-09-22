package com.cts.ecart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.ecart.dto.ProductDTO;
import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;
import com.cts.ecart.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}

	// load Form
	@RequestMapping(value = "/loadProductForm")
	public String loadProductForm(Model model) {
		// code to load data into options
		List<Category> findAllCategories = productService.findAllCategories();
		List<Brand> brands = productService.findAllBrands();
		model.addAttribute("categories", findAllCategories);
		model.addAttribute("brands", brands);

		return "product-form";
	}

	// list all Products
	@RequestMapping(value = "/findAllProducts")
	public String listAllProducts(Model model) {
		List<Product> products = productService.findAllProducts();
		model.addAttribute("allProducts", products);
		return "products";
	}
	
	@RequestMapping(value = "/saveProduct",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute ProductDTO product) {
		System.out.println(product);
		
		
		Product prod=new Product();
		prod.setProductDesc(product.getProductDesc());
		prod.setBrand(productService.findByBrandId(product.getBrandId()));
		prod.setCategory(productService.findBycategoryId(product.getCatId()));
		prod.setProductImage(product.getProductImage());
		prod.setProductKeywords(product.getProductKeywords());
		prod.setProductPrice(product.getProductPrice());
		prod.setProductQty(product.getProductQty());
		prod.setProductTitle(product.getProductTitle());
		
		productService.saveProduct(prod);
		
		return "index";
	}
	
	
	
	
	
	
	
	
	
	

}
