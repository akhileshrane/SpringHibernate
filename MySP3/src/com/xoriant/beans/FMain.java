package com.xoriant.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FMain {
 public static void main(String[] args) {
	 ApplicationContext flower = new ClassPathXmlApplicationContext("flowerbean.xml");
		FlowerBouquet flowerBouquet = (FlowerBouquet) flower.getBean("flowerBouquet");
		System.out.println(flowerBouquet);
	}
}

