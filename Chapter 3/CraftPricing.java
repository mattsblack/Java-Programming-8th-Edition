import java.util.Scanner;
public class CraftPricing {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter product name: ");
      String name = s.nextLine();
      System.out.println("Enter cost of materials: ");
      int cost = s.nextInt();
      System.out.println("Enter number of hours required: ");
      int hours = s.nextInt();
      int retailPrice = Calculator(cost, hours);
      System.out.println("Product name: " + name + "\n Retail price of product: $" + retailPrice);
   }
   public static int Calculator(int cost, int hours) {
      int retailPrice = ((cost + 12) * hours) + 7;
      return retailPrice;
   }
}