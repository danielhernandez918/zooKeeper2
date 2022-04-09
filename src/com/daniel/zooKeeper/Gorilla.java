package com.daniel.zooKeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public void throwSomething() {
		System.out.println("Gorilla throws poop at child!");
		this.energyLevel-= 5;
	}
	public void eatBananas() {
		System.out.println("Gorilla eats banana and is happy ");
		this.energyLevel+= 10;
	}
	public void climb() {
		System.out.println("Climbs out of zoo exhibit!");
		this.energyLevel-= 10;
	}
}
