package com.oil_gas.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int city_id;
	private	int areacode;
	private double price_per_unit,tax,total_amt;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Dealer dealer=new Dealer();
	
	@OneToOne(cascade = CascadeType.ALL)
	private Driver driver=new Driver();
	
    public City() {}
	public City(int city_id, int areacode, double price_per_unit, double tax,double total_amt,Dealer dealer,Driver driver) {
		super();
		this.city_id=city_id;
		this.areacode = areacode;
		this.price_per_unit = price_per_unit;
		this.tax = tax;
		this.total_amt=total_amt;
		this.dealer = dealer;
		this.driver=driver;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	public int getAreacode() {
		return areacode;
	}
	public void setAreacode(int areacode) {
		this.areacode = areacode;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(double total_amt) {
		this.total_amt = total_amt;
	}
	
	
	@Override
	public String toString() {
		return "City [ areacode=" + areacode + ", price_per_unit="
				+ price_per_unit + ", tax=" + tax + ", total_amt=" + total_amt + "]";
	}	
}