package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.ecart.model.Product;

@Controller
public class ProductController {
	
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/loadProductForm")
	public String loadProductForm() {
		return "product-form";
	}

	@RequestMapping(value = "/s1")
	public String f1() {
		System.out.println(">> f1 method of ProductController..");
		return "one";
	}
	

	@RequestMapping(value = "/products")
	public String f2(Model model) {
		String user="Praveen";
		// Model interface
		// ModelAndView class
		// ModelMap interface
		
		model.addAttribute("userName", user);
		
		System.out.println(">> f2 method of ProductController..");
		return "products";	
	}
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST )
	public String saveProduct(@RequestParam("productId") int productId,
							  @RequestParam("productName")String productName,
							  @RequestParam("productPrice") double productPrice,
							  @RequestParam("productDescription")String productDescription) {
		System.out.println("Product ID: "+productId+" "+productName+" "+productPrice+" "+productDescription);
		
		return "index";
	}
	
	@RequestMapping(value = "/saveProductV1")
	public String saveproductV1(@ModelAttribute Product product) {
		System.out.println(product);
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
