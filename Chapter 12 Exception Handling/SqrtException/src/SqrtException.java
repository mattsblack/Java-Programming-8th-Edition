import java.util.Scanner;

public class SqrtException {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int input;
		System.out.print("Enter a number to be square rooted: ");
		input = s.nextInt();
		try {
			
			if(input < 0) 
				throw new ArithmeticException();
			
			System.out.println(Math.sqrt(input));
		}
		catch(ArithmeticException e) {
			System.out.println("Error: number cannot be negative.");
		}
		finally {
			s.close();
		}
		
	}
	
}
