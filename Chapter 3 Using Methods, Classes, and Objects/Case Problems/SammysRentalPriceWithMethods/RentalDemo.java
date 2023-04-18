// RentalDemo.java

import java.util.Scanner;

public class RentalDemo {

    public static void main(String[] args) {
        // Create a Rental object
        Rental rental = new Rental();

        // Call data entry methods to set field values
        String contractNumber = getContractNumberFromUser();
        int minutes = getMinutesFromUser();

        rental.setContractNumber(contractNumber);
        rental.setHoursAndMinutes(minutes);

        // Call method from SammysRentalPriceWithMethods class to display company motto
        SammysRentalPriceWithMethods.displayMotto();

        // Call method to display rental details
        displayRentalDetails(rental);
    }

    // Method to get contract number from user
    public static String getContractNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contract number: ");
        return scanner.nextLine();
    }

    // Method to get minutes from user
    public static int getMinutesFromUser() {
        Scanner scanner = new Scanner(System.in);
        int minutes;
        System.out.print("Enter number of minutes for rental: ");
        minutes = scanner.nextInt();
        if (minutes < 0) {
            System.out.println("Error: Minutes must be a positive integer.");
            System.exit(0);
        }
        return minutes;
    }

    // Method to display rental details
    public static void displayRentalDetails(Rental rental) {
        System.out.println("Contract Number: " + rental.getContractNumber());
        System.out.println("Hours: " + rental.getHours());
        System.out.println("Minutes: " + rental.getMinutesOverHour());
        System.out.println("Hourly Rate: $" + Rental.HOURLY_RENTAL_RATE);
        System.out.println("Total Price: $" + rental.getPrice());
    }
}
