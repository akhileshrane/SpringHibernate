package com.xoriant.beans;

public class School {
	private String name;
	private String city;
	public School() {
		System.out.println("School constructor");
	}
	
	public School(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + "]";
	}
	
	
}
