// EventDemo.java

import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        // Create a new Event object
        Event event = new Event();

        // Get event number from user
        String eventNumber = getEventNumberFromUser();
        event.setEventNumber(eventNumber);

        // Get number of guests from user
        int numGuests = getNumGuestsFromUser();
        event.setGuests(numGuests);

        // Call method from CarlysEventPriceWithMethods class to display the company motto
        CarlysEventPriceWithMethods.displayMotto();

        // Call method to display event details
        displayEventDetails(event);
    }

    // Method to get event number from user
    public static String getEventNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event number: ");
        return scanner.nextLine();
    }

    // Method to get number of guests from user
    public static int getNumGuestsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        return scanner.nextInt();
    }

    // Method to display event details
    public static void displayEventDetails(Event event) {
        System.out.println("Event Number: " + event.getEventNumber());
        System.out.println("Number of Guests: " + event.getGuests());
        System.out.println("Price per Guest: $" + Event.PRICE_PER_GUEST);
        System.out.println("Total Price: $" + event.getPrice());
        System.out.println("Large Event: " + (event.getGuests() >= Event.LARGE_EVENT_CUTOFF));
    }
}
