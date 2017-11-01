package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) 
	{
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean from Spring Container
		Coach trackCoach1 = context.getBean("trackCoach", Coach.class);
		Coach trackCoach2 = context.getBean("trackCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (trackCoach1 == trackCoach2);
		
		// Print out the results
		System.out.println("\n Pointing to the same Object : " + result + "\n");
		
		System.out.println("\n Memory location for trackCoach1: " + trackCoach1 + "\n");
		System.out.println("\n Memory location for trackCoach2: " + trackCoach2 + "\n");
		
		// Close the context
		context.close();
	}
}
