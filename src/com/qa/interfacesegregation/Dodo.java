package com.qa.interfacesegregation;

public class Dodo extends Bird implements EggLayingCreature, ExtinctCreature {

	public Dodo(String currentLocation, int numberOfEggs) {
		super(currentLocation, numberOfEggs);
	}

	@Override
	public void goExtinct() {
		System.out.println("in a museum");
	}

	@Override
	public void layEggs() {
		System.out.println("i lay eggs");
	}

}
