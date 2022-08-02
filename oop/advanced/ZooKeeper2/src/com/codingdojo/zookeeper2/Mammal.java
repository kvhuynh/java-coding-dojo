package com.codingdojo.zookeeper2;

public class Mammal {
	private int energyLevel = 100;
	
	public Mammal() {
	}
	
	public int displayEnergy() {
		System.out.println("Current energy level is: " + this.energyLevel);
		return this.energyLevel;
	}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
