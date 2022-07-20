package com.oil_gas.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

//import org.springframework.beans.factory.annotation.Autowired;
import com.oil_gas.repo.dealer_repo;

@ExtendWith(MockitoExtension.class)
public class dealer_servicetest {
	
	@Mock
	dealer_repo dr;
	
	dealer_service ds;
	
	@BeforeEach
	void setup()
	{
		this.ds=new dealer_service(this.dr); 
	}
//////////////////////////////////////////////////////////////////////////////
//	AutoCloseable openMocks;
//	@BeforeEach
//	void setup()
//	{
//		AutoCloseable openMocks = MockitoAnnotations.openMocks(this); 
//		this.ds=new dealer_service(this.dr); 
//	}
//	@AfterEach         //////////use this code when we dont't want to use @ExtendWith(MockitoExtension.class) annotation
//	void teardown()    ////but this is time consuming instead of this use @ExtendWith(MockitoExtension.class) annotation 
//	{
//		try {
//			openMocks.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
/////////////////////////////////////////////////////////////////////////////////	
	@Test
	void getall()
	{
		ds.getdealer();
		verify(dr).findAll();
	}
}
