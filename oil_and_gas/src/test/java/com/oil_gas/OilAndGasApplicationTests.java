package com.oil_gas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OilAndGasApplicationTests {
	Calculator c=new Calculator();
	@Test
	@Disabled
	void contextLoads() {
	}
	
	@Test
	void testproduct()
	{
		int expected=6;
		int actual=c.product(3, 2);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
    void comparetwo()
    {
    	boolean b=c.comparetwono(3, 3);
    	assertThat(b).isTrue();
    }
}
