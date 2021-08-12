import java.util.Scanner;

public class Departments {

	public static void main(String[] args) {
		String[][] names = new String[5][2];
		Scanner sc = new Scanner(System.in);
		boolean found;
		final String QUIT = "999";
		for(int i = 0; i < names.length; i++) {
			System.out.print("Enter a department name: ");
			names[i][0] = sc.nextLine();
			System.out.print("Enter the department supervisor's name: ");
			names[i][1] = sc.nextLine();
		}
		System.out.print("Enter a department name to see the supervisor or 999 to quit: ");
		String input = sc.nextLine();
		while(!input.equals(QUIT)) {
			found = false;
			for(int i = 0; i < names.length; i++) {
					if(names[i][0].equalsIgnoreCase(input)) {
						System.out.println("Department: " + names[i][0] + "\nSupervisor: " + names[i][1]);
						found = true;
					}
					
			}
			if(!found) {
					System.out.println("Department not found.");
			}
			System.out.print("Enter a department to see the supervisor or 999 to quit: ");
			input = sc.nextLine();
		}
	}

}
