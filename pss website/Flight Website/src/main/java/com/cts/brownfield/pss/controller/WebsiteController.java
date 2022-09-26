package com.cts.brownfield.pss.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;



@Controller
public class WebsiteController {

	RestTemplate searchClient = new RestTemplate();
	RestTemplate bookingClient = new RestTemplate();
	RestTemplate checkInClient = new RestTemplate();
	
	
	private static final String searchURL="http://localhost:9090/api/v1/flights";
	private static final String bookURL="http://localhost:9090/api/v1/flights";



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greetingForm(Model model) {
		SearchQuery query = new SearchQuery("DELHI", "CHENNAI", LocalDate.of(2022, 9, 26), 2);
		UIData uiData = new UIData();
		uiData.setSearchQuery(query);
		model.addAttribute("uidata", uiData);
		return "SearchFlight";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute UIData uiData, Model model) {
		Flight[] flights = searchClient.postForObject(searchURL,uiData.getSearchQuery(), Flight[].class);
		System.out.println("====================================================================================");
		
		for(Flight flight:flights) {
			System.out.println(flight);
		}
		System.out.println("====================================================================================");

		uiData.setFlights(Arrays.asList(flights));
		model.addAttribute("uidata", uiData);
		return "result";
	}

	@RequestMapping("/book/{id}/{flightNumber}/{origin}/{destination}/{flightDate}/{flightTime}/{duration}/{ticketFare}/{numberofPassengers}")
	public String book(@PathVariable long id,@PathVariable String flightNumber, @PathVariable String origin, @PathVariable String destination,
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate flightDate,
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime flightTime,
			@PathVariable String duration,@PathVariable double ticketFare, @RequestParam int numberofPassengers,
			Model model) {
		System.out.println(">>>>>>>>. Ticket Fare:: "+ticketFare);

		UIData uiData = new UIData();
		Flight flight = new Flight(id,flightNumber, origin, destination, flightDate, flightTime, duration,ticketFare);
   		uiData.setSelectedFlight(flight);
   		uiData.setPassenger(new Passenger());
	    model.addAttribute("uidata",uiData);
	    model.addAttribute("numberofPassengers",numberofPassengers);

		return "BookFlight";
	}
	
	@RequestMapping("/bookFlight")
	public String bookFlight(@ModelAttribute UIData uiData,Model data,@RequestParam("id")long id,@RequestParam("numberofPassengers")int numberofPassengers) {
		
		Passenger p=uiData.getPassenger();
		System.out.println("====================================================================================");
		System.out.println(p);
		System.out.println("====================================================================================");
		
		
		Flight flight = searchClient.getForObject(searchURL + "/" + id, Flight.class);
		System.out.println("====================================================================================");
		System.out.println(flight);
		System.out.println("====================================================================================");

		
		data.addAttribute("flight", flight);
		data.addAttribute("numberofPassengers",numberofPassengers);
		BookingRecord bookingInfo = bookingClient.postForObject(bookURL+"/bookFlight/"+flight.getId()+"/"+numberofPassengers, p, BookingRecord.class);
		//data.addAttribute("passenger", bookingInfo.);

		data.addAttribute("bookingInfo",bookingInfo);
		return "BookingConfirmation";
	}
	
	
	
	@RequestMapping("/checkin/{flightNumber}/{origin}/{destination}/{flightDate}/{flightTime}/{duration}/{ticketFare}/{numberofPassengers}")
	public String checkin(@PathVariable String flightNumber, @PathVariable String origin, @PathVariable String destination,
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate flightDate,
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime flightTime,
			@PathVariable String duration,@PathVariable double ticketFare, @RequestParam int numberofPassengers,
			Model model) {
		
		    
		    
		  Flight flight = new Flight(0,flightNumber, origin, destination, flightDate, flightTime, duration,ticketFare);

		
		
		return "bookingsearch";
		
	}
	
	
	
	
	
	
	

}
