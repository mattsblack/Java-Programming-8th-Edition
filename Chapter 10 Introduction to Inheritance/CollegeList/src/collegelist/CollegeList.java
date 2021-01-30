package collegelist;

import java.util.Scanner;

public class CollegeList {
	public static void main(String[] args) {
		final char QUIT = 'Q';
		final int MAXCOLLEGE = 4, MAXFACULTY = 3, MAXSTUDENT = 7;
		boolean didFind = false;
		int counterCollege = 0, counterFaculty = 0, counterStudent = 0, a;
		Scanner sc = new Scanner(System.in);
		CollegeEmployee[] employees = new CollegeEmployee[MAXCOLLEGE];
		Faculty[] faculty = new Faculty[MAXFACULTY];
		Student[] students = new Student[MAXSTUDENT];
		
		System.out.println("Enter C to enter College Employee data"
										+ "\nEnter F to enter Faculty data"
										+ "\nEnter S to enter Student data"
									 	+ "\nor enter Q to quit: ");
		char input = sc.nextLine().toUpperCase().charAt(0);
		while(input != QUIT && 
				(counterCollege < MAXCOLLEGE || counterCollege < MAXFACULTY
				|| counterCollege < MAXSTUDENT)) {
			switch(input) {
			case 'C':
                if(counterCollege < MAXCOLLEGE){
                    employees[counterCollege] =
                            new CollegeEmployee();
                    employees[counterCollege].setFields();
                    ++counterCollege;
                }else
                    System.out.println("The amount of college employees is at its maximum");
                break;
            case 'F':
                if(counterFaculty < MAXFACULTY){
                    faculty[counterFaculty] = new Faculty();
                    faculty[counterFaculty].setFields();
                    ++counterFaculty;
                }else
                    System.out.println("The amount of faculty members is at its maximum");
                break;
            case 'S':
                if(counterStudent < MAXSTUDENT){
                    students[counterStudent] = new Student();
                    students[counterStudent].setFields();
                    ++counterStudent;
                }else
                    System.out.println("The amount of students is at its maximum");
                break;
            default:
                System.out.println("The option you picked was incorrect.");
                break;
			}
			if(counterCollege < MAXCOLLEGE || counterFaculty < MAXFACULTY
	                   || counterStudent < MAXSTUDENT){
	                       System.out.println("Do you want to enter a person's data? (C, F, S) \n"
	                                            +"Or quit(Q)?");
	                        input = sc.nextLine().toUpperCase().charAt(0);
	        }   
		}
		for(a = 0;a < employees.length;++a){
            if(employees[a] != null){
                employees[a].display();
                didFind = true;
            }
        }
        for(a = 0;a < faculty.length;++a){
            if(faculty[a] != null){
                faculty[a].display();
                didFind = true;
            }
        }
        for(a = 0;a < students.length;++a){
            if(students[a] != null){
                students[a].display();
                didFind = true;
            }
        }
        
        if(!didFind)
            System.out.println("Sorry, no values were entered to display.");
		
	}

}
