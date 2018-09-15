package com.xoriant.dto;

import java.util.*;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int sal;
	private List<Certificate> certs;
	public Employee(String firstName, String lastName, int sal, List<Certificate> certs) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sal = sal;
		this.certs = certs;
	}
	
	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getSal() {
		return sal;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public List<Certificate> getCerts() {
		return certs;
	}
	
	public void setCerts(List<Certificate> certs) {
		this.certs = certs;
	}
	
	
}
