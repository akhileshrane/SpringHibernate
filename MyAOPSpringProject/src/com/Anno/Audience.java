package com.Anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.Anno.Performer.perform(..))")
	public void performance() {
		
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("The audience are taking their seats now.");
	}
	
	@AfterReturning("performance()")
	public void applaud() {
		System.out.println("Clap clap");
	}
	
	@After("performance()")
	public void goHome() {
		System.out.println("going home");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Give us our money");
	}
	
}

