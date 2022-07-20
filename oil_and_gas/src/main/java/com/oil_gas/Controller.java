package com.oil_gas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oil_gas.entity.City;
import com.oil_gas.service.Service;

@RestController
@RequestMapping("/city")
public class Controller {
	@Autowired
	Service s;
	
	@PostMapping("/add_dataof_city")
	String add_dataof_city(@RequestBody City city)
	{
//		Driver driverd=new Driver(100, "plm", "pune");
//		Dealer dealerd=new Dealer(101,"chandu", "pune", 200);
//		City c=new City(1,123,150,15,2000,dealerd,driverd);
	  this.s.p1(city);
	  return "city ok";
	}

}