package com.xoriant.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		School school = (School) app.getBean("school");
		Student student = (Student) app.getBean("student");
		School school1 = (School) app.getBean("school1");
		System.out.println(school);
		System.out.println(school1);
		System.out.println(student);
	}
}
