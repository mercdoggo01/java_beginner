package com.joy.Spring_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/joy/Spring_Autowiring/config.xml");
        Student st = context.getBean("st",Student.class);
        System.out.println(st);
        
        
        //Output:
        // Student [address=Address [city=Pune, state=Maharashtra]]
    }
}
