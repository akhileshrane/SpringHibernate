package com.xoriant.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		Order order = (Order) app.getBean("order");
		Customer customer = (Customer) app.getBean("customer");
		System.out.println(order);
		System.out.println(customer);
	}
}
