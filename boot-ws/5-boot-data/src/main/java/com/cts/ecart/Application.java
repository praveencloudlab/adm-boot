package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.ecart.dao.ProductDaoImpl;
import com.cts.ecart.entity.Product;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

	public static void main(String[] args) {
	   ApplicationContext ac=	SpringApplication.run(Application.class, args);
	   ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
	   
	   Product p=new Product();
	   p.setId(14);
	   p.setName("Mac");
	   p.setPrice(2300);
	   p.setDescription("Mac Book");
	  // prodDao.save(p);
	   
	   
	   
	  // prodDao.findAll().stream().forEach(prod->{
		  // System.out.println(prod);
	  // });
	  /*
	   
	   Product prod = prodDao.findById(13);
	   if(prod!=null) {
		 prod.setName("New");
		 prod.setPrice(77777);
		 prodDao.update(prod);
	   System.out.println(prod);
	   }
	   else
	   System.out.println("Id not found");
	   */
	   
	  
	  
	   Product prod = prodDao.findById(14);
	   if(prod!=null)
		   prodDao.delete(prod);
	   else
		   System.out.println("Id not found");
		   
	   
	   
	}

}
