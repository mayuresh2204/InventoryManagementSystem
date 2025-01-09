package com.tka.InventoryManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;
	
	String sname;
	String phoneno;
	String city;
	
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(String sname, String phoneno, String city) {
		super();
		this.sname = sname;
		this.phoneno = phoneno;
		this.city = city;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", phoneno=" + phoneno + ", city=" + city + "]";
	}
	
}
