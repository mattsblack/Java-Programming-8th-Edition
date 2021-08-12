package collegecourse;

public class CollegeCourse {
	protected String department;
	protected int courseNum;
	protected int credits;
	protected int fee;
	
	public CollegeCourse(String department, int courseNum, int credits) {
		this.department = department;
		this.courseNum = courseNum;
		this.credits = credits;
		fee = credits * 120;
	}
	
	public void display() {
		System.out.println("Department: " + department + "\nCourse number: " + courseNum
							+ "\nCredits: " + credits + "\nFee:" + fee);
	}
}