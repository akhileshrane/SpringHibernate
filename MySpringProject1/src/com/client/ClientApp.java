package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Employee;

public class ClientApp {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("beansconf.xml");
		
		Address add = (Address) app.getBean("address");
		Employee emp = (Employee) app.getBean("emp");
		
		System.out.println(add);
		System.out.println(emp);
	
	}
}
