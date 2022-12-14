package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.dao.BrandDao;
import com.cts.ecart.dao.CategoryDao;
import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Category;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		ProductDao prodDao = ac.getBean(ProductDao.class);
		BrandDao brandDao = ac.getBean(BrandDao.class);
		CategoryDao catDao = ac.getBean(CategoryDao.class);
		
		//prodDao.findAll().forEach(System.out::println); // java 8 lamda
		
		// display only all available brands
		//brandDao.findAll().forEach(System.out::println);
		// display all categories
		//catDao.findAll().forEach(System.out::println);
		
		//Category cat = catDao.findById(12).orElse(null);
		//System.out.println(cat);
		
		
		
		
		// list all products whose price is greater than 12000?
		
		//prodDao.findByProductPriceGreaterThanEqual(6000).forEach(System.out::println);
		
		// list all product for given product name
		
		//prodDao.findByProductTitleLike("%plus%").forEach(System.out::println);
		
		// list all products whose brand name is samsung
		//prodDao.findByBrand_BrandTitleEquals("Samsung").forEach(System.out::println);
		
		// list all products whose category name is 'Mobiles'
		
		//prodDao.findByCategory_CatTitle("Home Appliances").forEach(System.out::println);
		
		
		//prodDao.listAll().forEach(System.out::println);
		
		//prodDao.findByName("%a%").forEach(prod->{
		//	System.out.println(prod.getCategory());
		//});
		
		/*prodDao.findAll().forEach(prod->{
			System.out.println(prod);
			System.out.println(prod.getCategory());
			System.out.println(prod.getBrand());
		});
		*/
		
		BrandDao bd = ac.getBean(BrandDao.class);
		//bd.saveBrand(6, "New");
		
		
		
		bd.findAll().forEach(System.out::println);
		
		//bd.listAllBrands().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
