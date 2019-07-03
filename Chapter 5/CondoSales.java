import java.util.Scanner;
public class CondoSales {
   public static void main(String[] args) {
      final int PARK_VIEW = 150000;
      final int GOLF_VIEW = 170000;
      final int LAKE_VIEW = 210000;
      int choice;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 1 for park view, 2 for golf view, and 3 for lake view");
      choice = s.nextInt();
      switch(choice) {
         case(1):
            System.out.println("Park View Condo" + "\nPrice: " + "$" + PARK_VIEW);
            break;
         case(2):
            System.out.println("Golf View Condo" + "\nPrice: " + "$" + GOLF_VIEW);
            break;
         case(3):
            System.out.println("Lake View Condo" + "\nPrice: " + "$" + LAKE_VIEW);
            break;
        default:
            System.out.println("You entered an invalid number. Please try again.");
     }
  }
}