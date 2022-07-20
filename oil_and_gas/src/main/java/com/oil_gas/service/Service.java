package com.oil_gas.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.oil_gas.entity.City;
import com.oil_gas.repo.oilandgas_repository;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	oilandgas_repository oilandgas_repo;
	public void p1(City city)
   {
		oilandgas_repo.save(city); 
   }
}
