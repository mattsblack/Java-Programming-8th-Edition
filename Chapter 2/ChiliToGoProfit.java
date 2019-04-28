import java.util.Scanner;
public class ChiliToGoProfit {
   public static void main(String[] args) {
      final int adultMeal = 7;
      final int childMeal = 4;
      final double produceAdult = 4.35;
      final double produceChild = 3.10;
      Scanner input = new Scanner (System.in);
      System.out.println("Enter the number of adult meals: ");
      int numAdult = input.nextInt();
      System.out.println("Enter the number of child meals: ");
      int numChild = input.nextInt();
      int adultTotal = adultMeal * numAdult;
      int childTotal = childMeal * numChild;
      int total = adultTotal + childTotal;
      double profitAdult = (adultMeal - produceAdult) * numAdult;
      double profitChild = (childMeal - produceChild) * numChild;
      double profitTotal = (profitAdult + profitChild);
      System.out.println("Amount of money collected for adult meals: $" + adultTotal);
      System.out.println("Amount of money collected for child meals: $" + childTotal);
      System.out.println("Amount of money collected for all meals: $" + total);
      System.out.println("The amount of profit for the adult meals: $" + (adultTotal - profitAdult));
      System.out.println("The amount of profit for the child meals: $" + (childTotal - profitChild));
      System.out.println("The amount of profit for all of the meals: $" + (total - profitTotal));
   }
}