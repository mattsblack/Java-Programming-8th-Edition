package collegecourse;
import java.util.Scanner;
public class InputGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] student = new Student[10];
		for(int s = 0; s < student.length; ++s) {
			System.out.println("Enter ID for student #" + (s+1));
			int id = input.nextInt();
			student[s] = new Student();
			student[s].setStudentID(id);
			for(int c = 1; c < 6; ++c) {
				System.out.println("Enter course ID for student " + (s+1) + ": ");
				String courseID = input.nextLine();
				System.out.println("Enter credit hours: ");
				int creditHours = input.nextInt();
				System.out.println("Enter a grade from 0 to 100: ");
				int Grade = input.nextInt();
				char letterGrade = gradeAssign(Grade);
				if ((letterGrade != 'A') && (letterGrade != 'B') && (letterGrade != 'C') &&	(letterGrade != 'D') && (letterGrade != 'F')) {				
						System.out.println("Error! Invalid Letter Grade Entered.");	
					}
				CollegeCourse course = new CollegeCourse(courseID, creditHours, letterGrade);
				student[s].setCollegeCourse(course, (c-1));
			}
			System.out.println();
			for(int i = 0; i < student.length; ++i) {
				student[i].display();
			}
			input.close();
		}
	}
	public static char gradeAssign(int Grade) {
		int grade = Grade;
		char letterGrade = 'N';
		if(grade <= 100 && grade >= 90 ) 
		{
			letterGrade = 'A';
		}
		else if(grade <= 89 && grade >= 80 ) 
		{
			letterGrade = 'B';
		}
		else if(grade <= 79 && grade >= 70 ) 
		{
			letterGrade = 'C';
		}
		else if(grade <= 69 && grade >= 60 ) 
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}
		return letterGrade;
	}
}
