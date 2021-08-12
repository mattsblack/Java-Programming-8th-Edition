import java.util.Scanner;

public class BadSubscriptCaught {
	public static void main(String[] args) {
		String[] firstNames = {"John", "Bob", "Matt", "Jake", "Mary", "Sarah", "Jimmy", "James","Tim", "Sam"};
		Scanner s = new Scanner(System.in);
		int choice;
		try {
			System.out.print("Enter a number: ");
			choice = s.nextInt();
			System.out.println(firstNames[choice]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		s.close();
	}

}
