package com.cts.pss.recource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.Flight;
import com.cts.pss.model.SearchQuery;
import com.cts.pss.service.FlightService;

@RestController // spring .4.6
@RequestMapping("/api/v1/flights")
@CrossOrigin
public class FlightResource {
	
	@Autowired
	private FlightService flightService;
	
	// find scheduled flight (source,destination,date and number of passengers)
	
	
	@GetMapping
	public List<Flight> searchResults(@RequestBody SearchQuery query){
		
		System.out.println(query);
		
		 List<Flight> flights = flightService.findFlights(query);
		 System.out.println(flights);
		
		return flights;
	}
	
	
	/*
	@PostMapping
	public String f2() {
		System.out.println("POST:: f2 method");
		return "POST:: f2 method";
	}
	
	@GetMapping
	public String f1() {
		System.out.println("GET:: f1 method");
		return "GET:: f1 method";
	}
	
	@PutMapping
	public String f3() {
		System.out.println("PUT:: f3 method");
		return "PUT:: f3 method";
	}
	
	@DeleteMapping
	public String f4() {
		System.out.println("DELETE:: f4 method");
		return "DELETE:: f4 method";
	}
	
	@PatchMapping
	public String f5() {
		System.out.println("PATCH:: f5 method");
		return "PATCH:: f5 method";
	}
	
	*/
	
	
	
	
	
	
	
	

}
