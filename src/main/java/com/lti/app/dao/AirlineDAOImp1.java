package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Airline;


@Repository
public class AirlineDAOImp1 implements AirlineDAO {
     @Autowired
     EntityManager eMan;

	@Override
	public boolean addAirline(Airline airline) {
		eMan.persist(airline);
		return true;
	}

	@Override
	public List<Airline> getAirline() {
		
		return eMan.createQuery("from Airline").getResultList();
	}

	@Override
	public List<Airline> searchFlight(String flightfrom, String flightto, String flightclass, String flightprice) {
		Query qry2=eMan.createQuery("from Airline v where v.flightfrom=?1 and v.flightto=?2 and v.flightclass=?3 and v.flightprice=?4");
		qry2.setParameter(1,flightfrom);
		qry2.setParameter(2,flightto);
		qry2.setParameter(3,flightclass);
		qry2.setParameter(4,flightprice);
		
		List<Airline> res=qry2.getResultList();
		return res;
	}

}




	

	
	
	
