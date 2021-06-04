package student;

public class StudentDemo {
	public static void main(String[] args) {
		Student[] students = new Student[6];
		students[0] = new UndergraduateStudent(942342,"Smith");
		students[1] = new UndergraduateStudent(534433,"Williams");
		students[2] = new GraduateStudent(211322,"Brown");
		students[3] = new GraduateStudent(543342,"Miller");
		students[4] = new StudentAtLarge(321642,"Davis");
		students[5] = new StudentAtLarge(523432,"Johnson");
		for(int i = 0; i < students.length; i++) {
			System.out.println("Student ID: " + students[i].getStudentID());
			System.out.println("Last Name: " + students[i].getLastName());
			System.out.println("Annual Tuition: $" + students[i].getTuition());
			System.out.println();
		}
	}
}