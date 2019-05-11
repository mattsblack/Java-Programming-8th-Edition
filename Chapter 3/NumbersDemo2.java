import java.util.Scanner;
public class NumbersDemo2 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter first number: ");
      int x = s.nextInt();
      System.out.println("Enter second number: ");
      int y = s.nextInt();
      displayTwiceTheNumber(x, y);
      displayNumberPlusFive(x, y);
      displayNumberSquared(x, y);
   }
   public static void displayTwiceTheNumber(int x, int y) {
      System.out.println(x * 2);
      System.out.println(y * 2);
   }
   public static void displayNumberPlusFive(int x, int y) {
      System.out.println(x + 5);
      System.out.println(y + 5);
   }
   public static void displayNumberSquared(int x, int y) {
      System.out.println(Math.pow(x, 2));
      System.out.println(Math.pow(y, 2));
   }
}