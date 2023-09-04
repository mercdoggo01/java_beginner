package com.merc01.java;

public class BasicChecker implements Checker
{
	public void checkMessage(String message) 
	{

		if(message!=null)
		{
			System.out.println("Message ok! Displaying in terminal..."+message);
		}
		else
		{
			throw new RuntimeException("Some error detected");
		}
	}
}
