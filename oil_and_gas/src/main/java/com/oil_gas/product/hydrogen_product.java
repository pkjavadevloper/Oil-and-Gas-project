package com.oil_gas.product;

public class hydrogen_product {
	int product_id;
	String product_name,dellor_name,assigned_driver_name;
	double price_per_liter,calculate;
	int quantity;
	double sometax;
	
	public hydrogen_product(int product_id, String product_name, String dellor_name, String assigned_driver_name,
			double price_per_liter, int quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.dellor_name = dellor_name;
		this.assigned_driver_name = assigned_driver_name;
		this.price_per_liter = price_per_liter;
		this.quantity = quantity;
		
	}
	hydrogen_product(){}
//	carbon capture and sequestration (CCS)
	public void method1()
	{
		sometax=(double)price_per_liter*quantity%3;
		System.out.println((double)price_per_liter*quantity);
	   System.out.println(sometax);
	}
	
public void method2()
{
	 calculate=(double)price_per_liter*quantity;
	 System.out.println(calculate+sometax);
}


public static void main(String[] args) {
	hydrogen_product p1=new hydrogen_product(1,"hydrogen based product","pk","vishal",10.9,4);
	p1.method1();p1.method2();
}
}