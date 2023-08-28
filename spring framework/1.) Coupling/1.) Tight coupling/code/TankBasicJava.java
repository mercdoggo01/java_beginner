package com.merc.learnspringframework;

import com.merc.learnspringframework.model.Gun;
import com.merc.learnspringframework.model.LeopardTwo;
import com.merc.learnspringframework.model.TypeSeventyTwoBThree;

public class TankBasicJava {

	public static void main(String[] args) 
	{
		// var  This is a reserved type name which automatically detects 
	    // data-type of variable on basis of context
		
		var tank = new TypeSeventyTwoBThree();
	//	var tankLeopard = new LeopardTwo();
		var gun = new Gun(tank);
		gun.fire();	
		
   // Output:
		
   /* 
   * Model of the tank is: com.merc.learnspringframework.model.TypeSeventyTwoBThree@156643d4
   * A shaped charge with a conical cavity with very high-velocity jet capable of piercing thick armour
   * A concical charge with fuse detonate upon impact for soft targets
   * Is a long dart penetrator with lot of kinetic energy to penetrate modern armor
   */	
		
	}

}
