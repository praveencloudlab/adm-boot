package com.cts.ecart;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Repository
//@Controller
//@Configuration

public class C1 {
	@Value("${name}")
	private String personName;
	
	public C1() { // loads before @Value
		System.out.println(">>> C1 class object created.....");
	}
	
	@Bean
	public void f1() {
		System.out.println("Name is "+personName);
	}
	
	@PostConstruct
	public void f2() {
		System.out.println(">> POST construct");
	}
	
	@PreDestroy
	public void f3() {
		System.out.println(">>> Bean Destroyed....");
	}
	
	
	

}
