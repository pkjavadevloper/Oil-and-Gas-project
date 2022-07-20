package com.oil_gas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int driver_id;
private String driver_name,address;
public Driver() {}
public Driver(int driver_id, String driver_name, String address) {
	super();
	this.driver_id = driver_id;
	this.driver_name = driver_name;
	this.address = address;
}
public int getDriver_id() {
	return driver_id;
}
public void setDriver_id(int driver_id) {
	this.driver_id = driver_id;
}
public String getDriver_name() {
	return driver_name;
}
public void setDriver_name(String driver_name) {
	this.driver_name = driver_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Driver [driver_id=" + driver_id + ", driver_name=" + driver_name + ", address=" + address + "]";
}
}
