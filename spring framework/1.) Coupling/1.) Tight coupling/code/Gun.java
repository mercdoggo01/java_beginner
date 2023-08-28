package com.merc.learnspringframework.model;

public class Gun 
{
    private TypeSeventyTwoBThree t72b3;
    
	public Gun(TypeSeventyTwoBThree t72b3)
    {
    	this.t72b3 = t72b3;
    }
    
    public void fire()
    {
    	System.out.println("Model of the tank is: "+ t72b3);
    	t72b3.heatProjectile();
    	t72b3.heProjectile();
    	t72b3.apfsdsProjectile();
    }
}
