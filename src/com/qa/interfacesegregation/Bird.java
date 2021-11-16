package com.qa.interfacesegregation;

public abstract class Bird {
	
	private String currentLocation;
	private int numberOfEggs;
	public Bird(String currentLocation, int numberOfEggs) {
		super();
		this.currentLocation = currentLocation;
		this.numberOfEggs = numberOfEggs;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public int getNumberOfEggs() {
		return numberOfEggs;
	}
	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	

}
