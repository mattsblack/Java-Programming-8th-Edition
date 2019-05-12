import java.util.Scanner;
public class Insurance {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your birth year: ");
      int yob = s.nextInt();
      System.out.println("Enter the current year: ");
      int year = s.nextInt();
      int age = year - yob;
      int premium = calcPremium(yob, year);
      System.out.println("The premium amount is " + premium);
   }
   public static int calcPremium(int yob, int year) {
      int age = year - yob;
      int premium = (age / 10) + 15 * 20;
      return premium;
   }
}