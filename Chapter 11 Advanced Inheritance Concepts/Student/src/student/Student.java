package student;

public abstract class Student {
	private int studentID;
	private String lastName;
	protected int annualTuition;
	
	//constructor
	public Student(int id, String lname) {
		studentID = id;
		lastName = lname;
		annualTuition = 0;
	}
	
	//set and get methods
	public void setStudentID(int id) {
		studentID = id;
	}
	public void setLastName(String lname) {
		lastName = lname;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public String getLastName() {
		return lastName;
	}
	public int getTuition() {
		return annualTuition;
	}
	public abstract void setTuition();
}
