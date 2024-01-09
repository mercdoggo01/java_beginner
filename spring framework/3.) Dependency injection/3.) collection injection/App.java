package com.joy.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/joy/collection/config.xml");
		Student st1 = context.getBean("st1", Student.class);
		System.out.println(st1);
	}

	// Output
	// Student [name=joy, address=[India, UK], phnno=[11111111111, 99999999999], courses={java=2 months, C++=8 months}]

	
}
