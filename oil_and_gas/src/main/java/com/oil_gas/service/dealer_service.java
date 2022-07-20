package com.oil_gas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oil_gas.entity.Dealer;
import com.oil_gas.repo.dealer_repo;

@Service
public class dealer_service {
	
	@Autowired
	dealer_repo dr;
	
	public dealer_service(dealer_repo repo)
	{
		this.dr=repo;
	}
	
	public void dealerdd(Dealer dealerd)
	{  dr.save(dealerd);   }
	
	public List<Dealer> getdealer()
	{
		List<Dealer> findall =(List<Dealer>) this.dr.findAll();
		return findall;
	}
	public Dealer get_single_dealer(int id)
	{
		Dealer findbyId  = this.dr.findById(id);
		return findbyId;
		
	}
}
