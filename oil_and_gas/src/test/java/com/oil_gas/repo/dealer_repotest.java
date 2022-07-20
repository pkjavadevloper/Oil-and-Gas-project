package com.oil_gas.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.oil_gas.entity.Dealer;
@SpringBootTest
public class dealer_repotest {
	@Autowired
	dealer_repo repo;

	
@Test
void isfindById()
{
//	Dealer d=new Dealer(4, "bhj", "pune", 200);
//	repo.save(d);
	boolean b=false;
	Dealer find = repo.findById(1);
	if(find!=null)
	{
		b=true;
	}
//	System.out.println(b);
	assertThat(b).isTrue();
}
@AfterEach
void teardown()
{
	System.out.println("tearing up 1");
	repo.deleteById(4);
	System.out.println("tearing up 2");
}
}
