package com.oil_gas.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class pro1 {
	@RequestMapping("/Services_page")
public String Servicespage()
{
	System.out.println("ok");
	return "Services_page";
	
}
	@RequestMapping("/finance")
public String finance()
{
	System.out.println("okkkk");
	return "finance";
}
	@RequestMapping("/distribution")
public String daily_update()
{
	System.out.println("okkkk");
	return "distribution";
}
	@RequestMapping("/NewFile")
public String daily_update_logic()
{
	System.out.println("okkkk");
	return "NewFile";
}
}
