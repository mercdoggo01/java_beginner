package com.corejava;

public class ControlStatements {
	// There are three types of control flow statements available in Java
	
	// 1.) Decision making statements
	// 2.) Loop statements
	// 3.) Jump statements
	
	public static void main(String []args)
	{
		
		// Decision making statements
		
		// 1.) If-else statements
		Boolean check = true;
		
		if(check)
		{
			System.out.println("Boolean value is true");
		}
		else
		{
			System.out.println("Boolean value is false");
		}
		
		// 2.) Switch statements
		
		int number =20;
		
		switch(number) {
		
		case 10: System.out.println("10");
		break; // break is a jump statement
		case 20: System.out.println("20");
		break;
		case 30: System.out.println("30");
		break;
		default: System.out.println("Not in range 10-30");
		
		
		// Loop statements
		
		// 1.) for loop
		
		for(int i=0 ; i<=10 ; i++)
		{
			System.out.println(i);
		}
		
		// 2.) for each loop
		
		int arr[] = {11,12,13,14,15};
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		// 3.) while loop
		
		int i =0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		// 4.) do while loop
		
		int j =1;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<=10);
		}
	}

}
