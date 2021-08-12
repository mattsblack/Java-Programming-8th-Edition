import java.util.Scanner;
import java.io.IOException;

public class CalculatorDemo2 {
	public static void main(String[] args) throws IOException {
		final int PROBLEMS = 5;
		Scanner input = new Scanner(System.in);
		Process proc = Runtime.getRuntime().exec
				("cmd /c C:\\Windows\\System32\\calc.exe");
		int num1, num2, answer, userAnswer;
		for(int i = 0; i < PROBLEMS; i++) {
			try {
				num1 = 1 + (int)(Math.random() * 10000);
				num2 = 1 + (int)(Math.random() * 10000);
				answer = num1 + num2;
				userAnswer = input.nextInt();
				
				System.out.println("What is the sum of " + num1 + " and " + num2 + " ? >> ");
				userAnswer = input.nextInt();
				if(userAnswer == answer) {
					System.out.println("Correct!");
				}
				else {
					System.out.println("Sorry - the answer is " + answer);
				}
				
			}
			catch(Exception e) {
				System.out.println("Invalid answer.");
				if(i < PROBLEMS - 1) {
					System.out.println("Try again.");
					input.nextLine();
				}
			}
			
		}
		input.close();
	}

}