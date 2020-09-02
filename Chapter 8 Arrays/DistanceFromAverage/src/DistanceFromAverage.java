import java.util.Scanner;
public class DistanceFromAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] values = new double[20];
		double average = 0;
		int total = 0,i;
		final int QUIT = 99999;
		do {
			System.out.println("Enter a number or 99999 to quit: ");
			for(i = 0; i < values.length; ++i) {
				values[i] = input.nextDouble();
				if(values[i] == QUIT) {
					--i;
					break;
				}
				else {
					total += values[i];	
				}
			}
		}while(values.length < 20);
		average = total/(i+1);
		System.out.println("The average of the values is: " + average);
		displayDistance(average, values);
		input.close();
	}
	public static void displayDistance(double average, double values[]) {
		for(int i = 0; i < values.length; ++i) {
			System.out.println("Value " + (i+1) + ":");
			System.out.println(values[i]);
			System.out.println("The distance from the average is: " + (Math.max(average, values[i]) - Math.min(average, values[i])));
		}  
	}
}
