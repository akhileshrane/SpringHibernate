package com.xoriant.beans;

public class Student {
	private String name;
	private int rollNo;
	private int std;
	private School school;
	
	public Student() {
		System.out.println("Student constructor");
	}

	public Student(String name, int rollNo, int std, School school) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.std = std;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", std=" + std + ", school=" + school + "]";
	}
	
	
}
