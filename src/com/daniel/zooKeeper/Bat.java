package com.daniel.zooKeeper;

public class Bat extends Mammal {
	public Bat () {
		super(300);
//		this.energyLevel = 300;
	}
	public Bat (int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("flap flap flap");
		this.energyLevel-= 50;
	}
	public void eatHumans() {
		System.out.println("Bat eats human!");
		this.energyLevel+= 25;
	}
	public void attackTown() {
		System.out.println("crackle crackle crackle Fire Everywhere!");
		this.energyLevel-= 100;
	}
}

