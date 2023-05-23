package com.ssd.hibernateonetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int aid;
	private String Street,city;
	private int pin;
	
	@OneToOne
	@JoinColumn(name="aid")
	private Employee employee;

	public Address() {
		
	}
	
	public Address(int aid, String street, String city, int pin) {
		super();
		this.aid = aid;
		this.Street = street;
		this.city = city;
		this.pin = pin;
			}
	
	
	
	


	
	
	
	

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", Street=" + Street + ", city=" + city + ", pin=" + pin + ", employee="
				+ employee + "]";
	}




	
	
	
	
}
