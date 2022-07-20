package com.oil_gas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oil_gas.entity.Driver;
import com.oil_gas.service.driver_service;

@RestController
@RequestMapping("/driver")
public class drivercontroller {
	@Autowired
	driver_service ds2;
	
	@PostMapping("/add_dataof_driver")
	String add_dataof_dealer(@RequestBody Driver driver)
	{
		this.ds2.driverdd(driver);
	      return "driver ok";
	}
}
