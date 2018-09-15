package com.beans;

public class Employee {
	
	private int empID;
	private String name;
	private char grade;
	private Address address;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", grade=" + grade + ", address=" + address + "]";
	}
	public Employee(int empID, String name, char grade, Address address) {
		super();
		this.empID = empID;
		this.name = name;
		this.grade = grade;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
