package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.dao.PassengerDao;
import com.cts.ecart.dao.PersonDao;
import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Address;
import com.cts.ecart.entity.Passenger;
import com.cts.ecart.entity.Person;
import com.cts.ecart.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);
		PersonDao personDao = ac.getBean(PersonDao.class);
		
		Address addr=new Address();
		addr.setHno("10-87/A1");
		addr.setStreet("MR Road, Road No 7");
		addr.setCity("Goa");
		addr.setCountry("India");
		
		Passenger p1=new Passenger();
		p1.setName("Vijay");
		p1.setEmail("vijay@abc.com");
		p1.setAddr(addr);
		
		PassengerDao pdao = ac.getBean(PassengerDao.class);
		pdao.save(p1);
		
		
		
		
		/*
		Person p1=new Person();
		p1.setPersonName("Kavya");
		p1.setPersonAddrInfo("Goa");
		
		personDao.save(p1);
		
		*/
		
		//prodDao.findAll().forEach(prod->{
			//System.out.println(prod);
		//});
			
	    /*  
		Product prod=prodDao.findById(111).orElse(null);
	      if(prod!=null)
	      System.out.println(prod);
	      else
	      System.out.println("ID not found");
	      */
		
		/*
		Product p=new Product();
		p.setId(15);
		p.setName("Book");
		p.setPrice(545);
		p.setDescription("Java Book");
		
		prodDao.save(p);
		*/
		
		// update
		
		/*
		Product prod = prodDao.findById(11).orElse(null);
		if(prod!=null) {
			prod.setName("E-Book");
			prod.setDescription("Java 8 Core Basics");
			prod.setPrice(76);
			prodDao.save(prod);
			
		}else {
			System.out.println("ID not Found");
		}
		*/
		
		// delete 
		/*
		Product prod = prodDao.findById(11).orElse(null);
		if(prod!=null) {
			prodDao.delete(prod);
		}else {
		 System.out.println("ID Not Found");
		}
		*/
		
		
	
		
		
		
		
		
	      
		
	}

}
