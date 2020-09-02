import java.util.Scanner;
public class ArrayMethodDemo {
	
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < numbers.length; ++i) {
			System.out.print("Enter a number: ");
			numbers[i] = input.nextInt();
		}
		displayNum(numbers);
		System.out.println();
		displayReverseNum(numbers);
		System.out.println();
		displaySum(numbers);
		System.out.println();
		displayLim(numbers);
		System.out.println();
		displayHigherThanAverage(numbers);
		input.close();
	}
	public static void displayNum(int numbers[]) {
		System.out.println("Numbers in order: ");
		for(int i = 0; i < numbers.length; ++i) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	public static void displayReverseNum(int numbers[]) {
		System.out.println("Numbers in reverse order: ");
		for(int j = numbers.length-1; j > 0; --j) {
			System.out.print(numbers[j] + " ");
		}
		System.out.println();
	}
	public static void displaySum(int numbers[]) {
		int total = 0;
		for(int k = 0; k < numbers.length; ++k) {
			total += numbers[k];
		}
		System.out.println("The sum is: " + total);
	}
	public static void displayLim(int numbers[]) {
		int lim = 50;
		System.out.println("Numbers below the limit are: ");
		for(int i = 0; i < numbers.length; ++i) {
			if(numbers[i] <= lim) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
	public static void displayHigherThanAverage(int numbers[]) {
		int total = 0;
		for(int i = 0; i < numbers.length; ++i) {
			total += numbers[i];
		}
		System.out.println("Numbers that are higher than average are: ");
		int average = total/numbers.length;
		for(int j = 0; j < numbers.length; ++j) {
			if(numbers[j] > average) {
				System.out.print(numbers[j] + " ");
			}
		}
	}
}
