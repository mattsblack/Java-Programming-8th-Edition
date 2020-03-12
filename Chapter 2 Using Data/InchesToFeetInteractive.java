import java.util.Scanner;
public class InchesToFeetInteractive {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of inches: ");
      int inches = input.nextInt();
      final int feet = inches/12;
      int remainder = inches%12;
      System.out.println(inches + " inches" + " is equal to " + feet + " feet " + remainder + " inches.");
   }
}