package com.course.buildings;

public class House extends Building {
	private int numBedrooms;
	private int numBaths;
	
	//get and set methods
	public void setBedrooms(int bedrooms) {
		numBedrooms = bedrooms;
	}
	public void setBathrooms(int baths) {
		numBaths = baths;
	}
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public int getNumBaths() {
		return numBaths;
	}
}
