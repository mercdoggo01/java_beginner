package com.joy.implement;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/joy/implement/config.xml");
		
		context.registerShutdownHook();
		
        Student st1 = context.getBean("st1",Student.class);
        System.out.println(st1);
        
        /*
         * Initialize object
           Student [id=1, name=joy]
           Destroy object
         * */
	}

}
