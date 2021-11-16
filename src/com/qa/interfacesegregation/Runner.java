package com.qa.interfacesegregation;

public class Runner {
	
	public static void main(String[] args) {
		Dodo d = new Dodo("In a museum",10);
		Falcon f = new Falcon("flying high", 20);
		
		d.setNumberOfEggs(6);
		System.out.println(d.getNumberOfEggs());
		d.setCurrentLocation("in a museum");
		System.out.println(d.getCurrentLocation());
		
		f.setCurrentLocation("in the sky");
		System.out.println(f.getCurrentLocation());
		f.setNumberOfEggs(5);
		System.out.println(f.getNumberOfEggs());
	}

}
