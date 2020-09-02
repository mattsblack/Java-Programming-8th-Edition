package collegecourse;

public class Student {
	private int ID;
	private CollegeCourse[] courses;
	public void setStudentID(int ID) {
		this.ID = ID;
	}
	public int getStudentID() {
		return ID;
	}
	public CollegeCourse getCollegeCourse(int num) {
		return courses[num];
	}
	public void setCollegeCourse(CollegeCourse courses, int position) {
		this.courses[position] = courses;
	}
	public Student() {
		courses = new CollegeCourse[5];
		this.ID = 0;
		for(int i = 0; i < courses.length; ++i) {
			courses[i] = new CollegeCourse();
		}
	}
	public void display() {
		System.out.println("Student ID: " + getStudentID());
		System.out.println("Course List: ");
		for(int i = 0; i < courses.length; ++i) {
			System.out.println(courses[i].getCourseID() + "\t" + courses[i].getCreditHours() + "\t" + courses[i].getLetterGrade());
		}
	}
}
