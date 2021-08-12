package collegecourse;

public class LabCourse extends CollegeCourse {

	public LabCourse(String department, int courseNum, int credits) {
		super(department, courseNum, credits);
		fee = (credits * 120) + 50;
	}
	
	public void display() {
		System.out.println("This course is a lab course.");
		super.display();
	}

}