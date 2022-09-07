package com.cts.ecart.dao.utils;

import java.util.ArrayList;
import java.util.List;

import com.cts.ecart.entity.Product;

public class ProductStoreDB {
	
	static List<Product> prods=new ArrayList<>();
	
	static {
		Product p1=new Product(1, "Book", 87, "Java Book");
		Product p2=new Product(2, "Pen", 12, "Blue Ink");
		Product p3=new Product(3, "Laptop", 45000, "Dell XP");
		Product p4=new Product(4, "Mouse", 12500, "Dell Wireless");
		Product p5=new Product(5, "Toy", 3500, "BMW Remote");
		//prods=Arrays.asList(p1,p2,p3,p4,p5);
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);
	}
	
	public static List<Product> getProducts() {
		return prods;
	}
	
	
	
	

}
