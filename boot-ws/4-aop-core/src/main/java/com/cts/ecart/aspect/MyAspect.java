package com.cts.ecart.aspect;


import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MyAspect {

	//private Logger logger = Logger.getLogger(getClass());

	
	/*
	@Before("execution(void com.cts.ecart.service.ProductServiceImpl.set*(*))")
	public void trackChange(JoinPoint jp) {
	//logger.info("Property about to change..."); 
		System.out.println(">>> Property about to change.. "+jp.getSignature());
	}
	
	@After("execution(void com.cts.ecart.service.ProductServiceImpl.set*(*))")
	public void propertyChanged(JoinPoint jp) {
	//logger.info("Property about to change..."); 
		System.out.println(">>> Property  changed.. "+jp.getSignature());
	}
	
	*/
	
	@Around("execution(Object com.cts.ecart.service.ProductServiceImpl.buyItem(*))")
	public Object checkBuyStatus(ProceedingJoinPoint pj) {
		
		Object status=null;
		
		try {
			System.out.println(">>>> Before proceed method  "+pj.getSignature());
			
			status=pj.proceed();
			
			// update to the server...
			
			System.out.println(">>>> After proceed method "+pj.getSignature());
			
			System.out.println(status);
	
		} catch (Throwable e) {
			e.printStackTrace();
			status=e;
		}finally {
			// close  connection
			status=status+ " at  "+LocalDateTime.now();
		}
		
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
