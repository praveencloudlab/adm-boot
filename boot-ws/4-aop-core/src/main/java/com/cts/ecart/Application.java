package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac=  SpringApplication.run(Application.class, args);
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		
		ps.setId(10);
		ps.setName("Pen");
		ps.setPrice(65);
		
		
		Object status=ps.buyItem(15000);
		System.out.println("main:: "+status);
		
		
		
	}

}
