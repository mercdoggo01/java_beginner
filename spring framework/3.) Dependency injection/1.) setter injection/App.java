package com.joy.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/joy/primitive/config.xml");
		
		
		// IOC container makes object using setter injection
		Student st1 = context.getBean("st1", Student.class), st2 = context.getBean("st2", Student.class);
		
		System.out.println(st1);
		System.out.println(st2);
		
		
		
		// setter injection done for both objects st1 and st2
		/*
		 * OUTPUT:
		 * Setter injection for: Id
           Setter injection for: Name
           Setter injection for: Address
           Setter injection for: Id
           Setter injection for: Name
           Setter injection for: Address
           Student [id=101, name=joy, address=Pune]
           Student [id=102, name=jack, address=Bhavnagar]
		 * */

	}

}
