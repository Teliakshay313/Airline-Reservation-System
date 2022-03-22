package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.app.pojo.Airline;
import com.lti.app.service.AirlineService;

@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200/addAirline")
public class AirlineController {
	@Autowired
	AirlineService vService;
	
	@GetMapping("/Airline")
	public List<Airline> getairline() {
		return vService.getairline() ;
	}
	
@PostMapping("/Airline")
public boolean addairline(@RequestBody Airline airline) {
	
	return vService.addairline(airline);
}

	@GetMapping("/Airline /{flightfrom}/{flightto}/{flightclass}/{flightprice}")
	public List<Airline> searchFlight(@PathVariable("flightfrom") String ffrom,@PathVariable("flightto") String fto,@PathVariable("flightclass") String  fclass,@PathVariable("flightprice") String fprice)
	{
		return vService.searchFlightsearchFlight( ffrom, fto,fclass ,fprice );
	}
	
		
		
	}

	

