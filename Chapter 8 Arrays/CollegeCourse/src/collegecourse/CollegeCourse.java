package collegecourse;

public class CollegeCourse {
	private String courseID;
	private int creditHours;
	private char letterGrade;
	
	public void setCourseID(String id) {
		courseID = id;
	}
	public void setCreditHours(int hours) {
		creditHours = hours;
	}
	public void setLetterGrade(char grade) {
		letterGrade = grade;
	}
	public String getCourseID() {
		return courseID;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public char getLetterGrade() {
		return letterGrade;
	}
	
	public CollegeCourse() {
		this.courseID = "";
		this.creditHours = 0;
		this.letterGrade = 'F';
	}
	
	public CollegeCourse(String courseID, int creditHours, char letterGrade) {
		this.courseID = courseID;
		this.creditHours = creditHours;
		this.letterGrade = letterGrade;
	}
}
