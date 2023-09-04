package com.merc01.java;

public class AdvancedChecker  implements Checker
{
    
	public void checkMessage(String message) 
	{
		if(message!=null)
		{
			System.out.println("Message ok! Displaying in terminal..."+message+ "Length of message is:" +message.length());
		}
		else
		{
			throw new RuntimeException("Some error detected");
		}
	}
	
}
