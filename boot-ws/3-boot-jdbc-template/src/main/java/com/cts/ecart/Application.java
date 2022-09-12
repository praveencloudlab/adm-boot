package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.entity.Product;
import com.cts.ecart.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductService ps = ac.getBean(ProductService.class);
		
		Product p1=new Product(13, "Laptop", 17500, "Intel I3");
		ps.save(p1);
		
		ps.findAll().forEach(product->{
			System.out.println(product);
		});
		
		System.out.println("========================");
		
		Product prod = ps.findById(10);
		
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("ID Not Found");
		}
		
	}

}
