package com.course.buildings;

public class School extends Building {
	private int numClassrooms;
	private String gradeLevel;
	
	//get and set methods
	public void setNumClassrooms(int classrooms) {
		numClassrooms = classrooms;
	}
	public void setGradeLevel(String glevel) {
		gradeLevel = glevel;
	}
	public int getNumClassrooms() {
		return numClassrooms;
	}
	public String getGradeLevel() {
		return gradeLevel;
	}
}
