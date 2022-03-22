package com.lti.app.dao;

import java.util.List;
import com.lti.app.pojo.Airline;
public interface AirlineDAO {
	
	public boolean addAirline(Airline airline);
	public List<Airline> getAirline();
	
	public List<Airline> searchFlight(String flightfrom,String flightto,String flightclass,String flightprice);
}
