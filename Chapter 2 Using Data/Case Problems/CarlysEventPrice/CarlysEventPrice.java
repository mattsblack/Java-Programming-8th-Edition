import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        final int PRICE_PER_PERSON = 35;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of guests: ");
        int numOfGuests = sc.nextInt();
        int totalPrice = numOfGuests * PRICE_PER_PERSON;
        System.out.println("*****************************************************");
        System.out.println("* Carly's makes the food that makes it a party! *");
        System.out.println("*****************************************************");
        System.out.println("Number of guests: " + numOfGuests);
        System.out.println("Price per guest: " + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + (numOfGuests >= 50));
    }
}