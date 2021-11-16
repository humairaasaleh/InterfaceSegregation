package com.qa.interfacesegregation;

public class Falcon extends Bird implements FlyingCreature, EggLayingCreature {

	public Falcon(String currentLocation, int numberOfEggs) {
		super(currentLocation, numberOfEggs);
	}

	@Override
	public void layEggs() {
		System.out.println("I lay eggs");
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

}
