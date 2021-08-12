import java.util.Scanner;
public class CarCareChoice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		String[] validChoices = {"oil change", "tire rotation", "battery check", "brake inspection"};
		System.out.println("Cody's Car Care Shop");
		System.out.println("List of available services: Oil Change, Tire Rotation, Battery Check, Brake Inspection");
		System.out.println("Choose a service: ");
		choice = input.nextLine().toLowerCase();
		for(int i = 0; i <= 4; ++i) {
			switch(choice) {
			case "oil change": case "oil":
				System.out.println("Price for Oil Change: $25");
				System.exit(0);
				break;
			case "tire rotation": case "tir":
				System.out.println("Price for Tire Rotation: $22");
				System.exit(0);
				break;
			case "battery check": case "bat":
				System.out.println("Price for Battery Check: $15");
				System.exit(0);
				break;
			case "brake inspection": case "bra":
				System.out.println("Price for Brake Inspection: $5");
				System.exit(0);
				break;
			}
			if(choice.compareTo(validChoices[i]) != 0) {
				System.out.println("Invalid Choice.");
				System.exit(0);
			}
		}
		input.close();

	}

}
