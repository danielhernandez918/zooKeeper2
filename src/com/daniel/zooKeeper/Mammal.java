package com.daniel.zooKeeper;

public class Mammal {
//    private boolean sleeping = false;
	protected int energyLevel;
	
    public Mammal(){
    	this.energyLevel = 80;
    }
    
	
//    public void regulateTemperature() {
//        System.out.println("My temperature is just right now.");
//    }
//    public void startSleeping() {
//        sleeping = true;
//        System.out.println("ZzZz");
//    }
//    public boolean isSleeping(){
//        return sleeping;
//    }
	
    
    
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
    public int getEnergyLevel() {
        return this.energyLevel;
    }
    
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    
    public void display () {
    	System.out.println(this.getEnergyLevel());
    	
    }
}
