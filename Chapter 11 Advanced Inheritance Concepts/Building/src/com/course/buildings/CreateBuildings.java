package com.course.buildings;

public class CreateBuildings {
	public static void main(String[] args) {
		House h = new House();
		School s = new School();
		
		//set info
		h.setSquareFootage(2000);
		h.setStories(2);
		h.setBedrooms(3);
		h.setBathrooms(2);
		
		s.setSquareFootage(84000);
		s.setStories(3);
		s.setNumClassrooms(30);
		s.setGradeLevel("High School");
		
		//display info
		System.out.println("House Square Footage: " + h.getSquareFootage());
		System.out.println("House Stories: " + h.getStories());
		System.out.println("House Bedrooms: " + h.getNumBedrooms());
		System.out.println("House Bathrooms: " + h.getNumBaths());
		
		System.out.println(); //spacing
		
		System.out.println("School Square Footage: " + s.getSquareFootage());
		System.out.println("School Building Stories: " + s.getStories());
		System.out.println("School Classroom Number: " + s.getNumClassrooms());
		System.out.println("School Grade Level: " + s.getGradeLevel());
		
	}
	
	
}
