package com.oil_gas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oil_gas.entity.Dealer;
import com.oil_gas.service.dealer_service;

@RestController
@RequestMapping("/dealer")
public class dealercontroller {
	@Autowired
	dealer_service ds;
	
	@PostMapping("/add_dataof_dealer")
	String add_dataof_dealer(@RequestBody Dealer dealer)
	{
		this.ds.dealerdd(dealer);
	      return "dealer ok";
	}
	
	@GetMapping("/get_dealer_all")
	@ResponseBody List<Dealer> get_dealer_all()
	{
		return this.ds.getdealer();
	}
    
	@GetMapping("/get_single_dealer/{dealer_id}")
	@ResponseBody boolean getsingledealer(@PathVariable int dealer_id)
	{
		Dealer get_single_dealer = this.ds.get_single_dealer(dealer_id);
		Optional<Dealer> ofNullable = Optional.ofNullable(get_single_dealer);
		boolean b=ofNullable.orElse(get_single_dealer) != null;
	
		return b;
	}
}