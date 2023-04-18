import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        // Constants for rental rate
        final double RATE_PER_HOUR = 40.0;
        final double RATE_PER_MINUTE = 1.0 / 60.0;

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes rented: ");
        int minutes = scanner.nextInt();

        // Calculate hours and remaining minutes
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // Calculate total price
        double totalPrice = (hours * RATE_PER_HOUR) + (remainingMinutes * RATE_PER_MINUTE);

        // Display Sammy's motto with border
        System.out.println("**********************************");
        System.out.println("*   Sammy's Sports Equipment     *");
        System.out.println("*          Rental Prices          *");
        System.out.println("**********************************");

        // Display hours, minutes, and total price
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Total Price: $" + totalPrice);
    }
}
