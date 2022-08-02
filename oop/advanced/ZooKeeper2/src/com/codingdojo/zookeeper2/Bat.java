package com.codingdojo.zookeeper2;

public class Bat extends Mammal{
	public Bat() {
		this.setEnergyLevel(300); 
	}
	
	public void fly() {
		System.out.println("Bat has taken off");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
		this.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Bat has eaten a human");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("The bat has set the town on fire");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
		this.displayEnergy();
	}
	
}
