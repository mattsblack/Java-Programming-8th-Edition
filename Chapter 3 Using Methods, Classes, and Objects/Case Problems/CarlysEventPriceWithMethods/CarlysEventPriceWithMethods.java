import java.util.Scanner;

public class CarlysEventPriceWithMethods {
    public static void main(String[] args) {
        final int PRICE_PER_PERSON = 35;
        int numOfGuests = getNumOfGuests();
        int totalPrice = numOfGuests * PRICE_PER_PERSON;
        displayMotto();
        displayEventInfo(numOfGuests, PRICE_PER_PERSON, totalPrice);
        displayIsLargeEvent(numOfGuests);
    }
    public static int getNumOfGuests() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of guests: ");
        return sc.nextInt();
    }
    public static void displayMotto() {
        System.out.println("*****************************************************");
        System.out.println("* Carly's makes the food that makes it a party! *");
        System.out.println("*****************************************************");
    }
    public static void displayEventInfo(int numOfGuests, int PRICE_PER_PERSON, int totalPrice) {
        System.out.println("Number of guests: " + numOfGuests);
        System.out.println("Price per guest: " + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
    }
    public static void displayIsLargeEvent(int numOfGuests) {
        System.out.println("Is this a large event? " + (numOfGuests >= 50));
    }
}