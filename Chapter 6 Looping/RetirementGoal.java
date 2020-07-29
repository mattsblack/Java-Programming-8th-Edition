import java.util.Scanner;
public class RetirementGoal {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int years, savings;
   do {
      System.out.println("How many years until retirement? ");
          years = s.nextInt();
      System.out.println("How much money can you save annually? ");
         savings = s.nextInt();
      } while(savings <= 0 || years <= 0);
    int total = years * savings;
    System.out.println("Amount of money at retirement: $" + total);
  }
}