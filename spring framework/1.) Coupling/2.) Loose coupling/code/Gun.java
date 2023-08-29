package com.merc.learnspringframework.model;

public class Gun 
{
    private TypeOfProjectile tank;
    
	public Gun(TypeOfProjectile tank)
    {
    	this.tank = tank;
    }
    
    public void fire()
    {
    	System.out.println("Model of the tank is: "+ tank);
    	tank.heatProjectile();
    	tank.heProjectile();
    	tank.apfsdsProjectile();
    }
}
