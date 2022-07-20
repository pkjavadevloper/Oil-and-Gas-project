package com.oil_gas.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealer_id;
	private String dealer_name,dealer_address;
	private double quantity;
	public Dealer() {}
	public Dealer(int dealer_id, String dealer_name, String dealer_address, double quantity) {
		super();
		this.dealer_id=dealer_id;
		this.dealer_name = dealer_name;
		this.dealer_address = dealer_address;
		this.quantity= quantity;
	}
	
	public int getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public String getDealer_address() {
		return dealer_address;
	}
	public void setDealer_address(String dealer_address) {
		this.dealer_address = dealer_address;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "dealer [dealer_id=" + dealer_id  + ", dealer_name=" + dealer_name + ", dealer_address="
				+ dealer_address + "]";
	}
}