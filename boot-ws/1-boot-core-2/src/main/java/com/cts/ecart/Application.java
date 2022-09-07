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
		
		Product p1=new Product(10, "Ball Pen", 888, "Blue Ink");
		
		ps.save(p1);
		
		Product product = ps.findById(4);
		if(product!=null) {
			System.out.println(product);
		}else {
			System.out.println("ID Not found...");
		}
		System.out.println("========================================");
		ps.findAll().forEach(prod->{
			System.out.println(prod);
		});
		
		
		
	}

}
