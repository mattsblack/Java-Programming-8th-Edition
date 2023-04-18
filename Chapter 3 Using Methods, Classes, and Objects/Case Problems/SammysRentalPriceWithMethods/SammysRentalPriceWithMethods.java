import java.util.Scanner;

public class SammysRentalPriceWithMethods {
    public static void main(String[] args) {
        int minutes = getMinutes();
        int hours = minutes / 60;
        int minutesLeft = minutes % 60;
        int price = calculatePrice(hours, minutesLeft);
        displayMotto();
        displayPriceInfo(minutes, hours, minutesLeft, price);
    }
    public static int getMinutes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        return sc.nextInt();
    }
    public static int calculatePrice(int hours, int minutesLeft) {
        int price = 40;
        if (hours > 0) {
            price += (hours - 1) * 10;
        }
        if (minutesLeft > 0) {
            price += 10;
        }
        return price;
    }
    public static void displayMotto() {
        System.out.println("*****************************************************");
        System.out.println("* Sammy’s makes it fun in the sun. *");
        System.out.println("*****************************************************");
    }
    public static void displayPriceInfo(int minutes, int hours, int minutesLeft, int price) {
        System.out.println("Number of minutes: " + minutes);
        System.out.println("Number of hours: " + hours);
        System.out.println("Number of minutes left: " + minutesLeft);
        System.out.println("Price: $" + price);
    }
}