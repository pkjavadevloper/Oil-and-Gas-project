package com.oil_gas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oil_gas.entity.Driver;
import com.oil_gas.repo.driver_repo;

@Service
public class driver_service {
	@Autowired
	driver_repo drirepo;
	public void driverdd(Driver driverd )
	{
		drirepo.save(driverd); 
	}
}
