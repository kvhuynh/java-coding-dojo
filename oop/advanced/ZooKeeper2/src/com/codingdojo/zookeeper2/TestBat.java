package com.codingdojo.zookeeper2;

public class TestBat {

	public static void main(String[] args) {
		Bat bat1 = new Bat();
		
		System.out.println(bat1.displayEnergy());
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown(); 
		
		bat1.eatHumans();
		bat1.eatHumans();
		
		bat1.fly();
		bat1.fly();
	}

}
