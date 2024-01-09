package com.joy.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/joy/constructor/config.xml");
		Student st1 = context.getBean("st1",Student.class);
		System.out.println(st1);
		
		//Output:
		// Student [id=101, name=Joy]

	}

}
