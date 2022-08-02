package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		
	}
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
		this.displayEnergy();
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla has eaten a banana");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
		this.displayEnergy();

	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		this.displayEnergy();

	}
}
