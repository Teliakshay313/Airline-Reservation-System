package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Airline;

public interface AirlineService {
	public boolean addairline(Airline airline);
	public List<Airline> getairline();
	
	public List<Airline> searchFlightsearchFlight(String flightfrom,String flightto,String flightclass,String flightprice);
}

