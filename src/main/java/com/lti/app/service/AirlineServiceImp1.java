package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.AirlineDAO;
import com.lti.app.pojo.Airline;
@Service
@Transactional
public class AirlineServiceImp1 implements AirlineService 
{
 @Autowired
 AirlineDAO vdao;
	@Override
	public boolean addairline(Airline airline) {
		
		return vdao.addAirline(airline);
	}

	@Override
	public List<Airline> getairline() {
		
		return vdao.getAirline();
	}

	@Override
	public List<Airline> searchFlightsearchFlight(String flightfrom, String flightto, String flightclass,
			String flightprice) {
		
		return vdao.searchFlight(flightfrom, flightto, flightclass, flightprice);
	}

	

	


}
