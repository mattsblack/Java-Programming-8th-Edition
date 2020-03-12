import java.util.Scanner;
public class ChiliToGo {
   public static void main(String[] args) {
      final int adultMeal = 7;
      final int childMeal = 4;
      Scanner input = new Scanner (System.in);
      System.out.println("Enter the number of adult meals: ");
      int numAdult = input.nextInt();
      System.out.println("Enter the number of child meals: ");
      int numChild = input.nextInt();
      int adultTotal = adultMeal * numAdult;
      int childTotal = childMeal * numChild;
      int total = adultTotal + childTotal;
      System.out.println("Amount of money collected for adult meals: $" + adultTotal);
      System.out.println("Amount of money collected for child meals: $" + childTotal);
      System.out.println("Amount of money collected for all meals: $" + total);
   }
}