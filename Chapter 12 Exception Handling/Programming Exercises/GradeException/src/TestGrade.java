import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		int[] IDs = new int[10];
		String[] grades = new String[IDs.length];
		boolean check = false;
		Scanner input = new Scanner(System.in);
		
		//ask user to enter Student IDs
		for(int i = 0; i < IDs.length; i++) {
			System.out.println("Enter student ID: ");
			IDs[i] = input.nextInt();
		}
		
		//added to absorb next key press
		//if removed, it will skip the first array value
		input.nextLine();
		
		
		//prompt user to enter grades
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter grade for ID #" + IDs[i] + ":");
			String testGrade = input.nextLine();
			try {
				validate(testGrade);
			}
			catch(GradeException e) {
				grades[i] = "I";
				check = true;
				System.out.println(e.getMessage());
				
			}
			finally {
				if(!check) {
					grades[i] = testGrade;
				}
			}
		}
		
		//display grades
		int i = 0;
		for(int id : IDs) {
			System.out.println("Student ID: " + id + "\nGrade: " + grades[i++]);
		}
		
		input.close();
	}
	
	//method to check if the grade is valid
	public static void validate(String testGrade) throws GradeException {
		boolean check = false;
		
		//for each value in the valid grades array, check if the test grade matches the array value
		//if true, keep the array value
		//if false, change the grade to "I"
		
		for(String s : GradeException.validGrades) {
			if(s.equals(testGrade)) {
				check = true;
				break;
			}
		}
		if(!check) {
			throw new GradeException("Invalid Grade");
		}
	}

}