package collegecourse;

import java.util.Scanner;

public class UseCourse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 String department;
	        int courseNumber, credits;
	        CollegeCourse cCourse;
	        LabCourse lCourse;
	        System.out.print("Enter the department >> ");
	        department = input.nextLine();
	        System.out.print("Enter the course number >> ");
	        courseNumber = input.nextInt();
	        input.nextLine();
	        System.out.print("Enter the credits >> ");
	        credits = input.nextInt();
	        input.nextLine();
	        department = department.substring(0, 3).toUpperCase();
	        switch(department){
	            case "BIO":
	            case "CHM":
	            case "CIS":
	            case "PHY":
	                lCourse = new LabCourse(department, courseNumber, credits);
	                lCourse.display();
	                break;
	            default:
	                cCourse = new CollegeCourse(department, courseNumber, credits);
	                cCourse.display();
	                break;
	        }
	}
}