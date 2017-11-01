package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) 
	{
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve bean from Spring Container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);

		System.out.println(trackCoach.getDailyWorkout());
		// Close the context
		context.close();
	}
}
