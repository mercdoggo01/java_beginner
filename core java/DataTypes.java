package com.corejava;

// This is a single line comment

/* 
 * This is a multiple line
 * comment
 * */

/**
 * This is a
 * documentation type
 * comment
 * */

public class DataTypes {
// variable is a container which holds the value while the program is executed

// There are two types of variables i) primitive and ii) non-primitive

	
	
	public static void main(String args[])
	{
		// Primitive data types
		// Primitive data-types are classified into two i) Boolean and ii) Numeric
		
		Boolean val = true; // Boolean data type can be of size 1 bit either true or false
		System.out.println(val);
		
		// In numeric type primitive data-type it can be further classified into 
		// integral or character data-type
		
		char letterA = 'A';  // char data-type is of 2 byte
		System.out.println(letterA);
		// Also java uses unicode system not ASCII system
		// \u0000 is the smallest unicode value
		
		// Integral type data can be classified into numeric or floating point data
		// 1.) Numeric data types
		// All of these have default value 0
		
		byte a = 10; // byte datatype is of size 1 byte ranges from -128 to 127,
		//it is used to save memory in arrays etc.
		System.out.println(a);
		
		short b = 1000; // This datatype is of size 2 bytes and ranges from -32,768 to 32,767
		System.out.println(b);
		
		int c = 10000; // This datatype is of 4 bytes, ranging from -2^31 to  -2^31-1 
		System.out.println(c);
		
		long d = 1000L; // This datatype is of 8 bytes, ranging from -2^63 to 2^63-1
		System.out.println(d);
		
		// 2.) Floating point type
		float  f1 = 24.5f; //  This type of data is of 4 bytes
		System.out.println(f1);
		
		double d1 = 245.6789; // This data type is of 8 bytes
		System.out.println(d1);
		
		// Non-primitive data-types include Array and string
		
		// Array
		int arr[] = new int[5];
		for(int i=1 ; i<=5 ; i++)
		{
			arr[i-1]  = i;
		}
		for(int i:arr)
		{
		System.out.println(i);
		}
		
		// String
		String s = "welcome";
		System.out.println(s);
	}

}
