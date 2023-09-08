package demo;

// This example is used to demonstrate XML based configuration for spring beans


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		
		// use try with resources block for context to stop leak
		ApplicationContext context  = new  ClassPathXmlApplicationContext("spring.xml");
		
		// Use of beans
		Doctor staff  =  context.getBean(Doctor.class);
		staff.assist();
		
		// Setter injection the value MBBS is assigned to the private
		// variable qualification, using property tag in the xml file
		System.out.println(staff.getQualification());
		
		
		
		// Constructor injection
		Nurse nurse = context.getBean(Nurse.class);
		System.out.println(nurse.getPosition());
	}
		
    // Output:
	// Doctor is assisting
	// MBBS
	// Head
}

