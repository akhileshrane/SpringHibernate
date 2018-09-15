package com.Anno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app1 =  new ClassPathXmlApplicationContext("beanAnnot.xml");
		Performer performer = (Performer) app1.getBean("performer");
		try {
			performer.perform();
		} catch (Exception e) {
		}		
}
}