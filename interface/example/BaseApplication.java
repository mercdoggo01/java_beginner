package com.merc01.java;

// This example is used to demonstrate loose coupling
// Loose coupling forms the basis for the Spring framework
// Spring framework is useful of enterprise level applications
//


public class BaseApplication {

	public static void main(String[] args) {
		
		// New object client of CLient class
		Client client = new Client(new BasicChecker());
		Client clientOne = new Client(new AdvancedChecker());
		// Here loose coupling takes place as no Client is not directly tied to 
		// Basic and Advanced checker, instead we are taking the dependencies from the
		// respective classes
		
		client.sendMessage("DoggoMcChoggo");
		clientOne.sendMessage("Roggo");
		
	}

}
