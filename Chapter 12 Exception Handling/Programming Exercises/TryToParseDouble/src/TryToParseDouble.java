import java.util.Scanner;

public class TryToParseDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number = 0;
		try {
			System.out.print("Enter a floating point number: ");
			String input = sc.nextLine();
			number = Double.parseDouble(input);
		}
		catch(NumberFormatException e) {
			number = 0;
			System.out.println("Error: Please enter a number");
		}
		System.out.println("The number is: " + number);
		sc.close();
	}
}
