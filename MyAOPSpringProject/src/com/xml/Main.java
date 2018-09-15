package com.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app =  new ClassPathXmlApplicationContext("bean.xml");
		Performer performer = (Performer) app.getBean("performer");
		try {
			performer.perform();
		} catch (Exception e) {
			System.out.println("Exception occured.");
		}
}
}