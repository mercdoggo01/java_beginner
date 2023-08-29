package com.merc.learnspringframework;

import com.merc.learnspringframework.model.Gun;
import com.merc.learnspringframework.model.LeopardTwo;
import com.merc.learnspringframework.model.TypeSeventyTwoBThree;

public class TankBasicJava {

	public static void main(String[] args) 
	{
		
		
		var tank = new TypeSeventyTwoBThree();
	    //var tankLeopard = new LeopardTwo();
		var gun = new Gun(tank);
		gun.fire();	
		
		
	}

}
