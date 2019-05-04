import java.util.Scanner;
public class NumbersDemo2 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter first number: ");
      x = s.nextInt();
      System.out.println("Enter second number: ");
      y = s.nextInt();
      displayTwiceTheNumber();
      displayNumberPlusFive();
      displayNumberSquared();
   }
   public static void displayTwiceTheNumber() {
      System.out.println(x * 2);
      System.out.println(y * 2);
   }
   public static void displayNumberPlusFive() {
      System.out.println(x + 5);
      System.out.println(y + 5);
   }
   public static void displayNumberSquared() {
      System.out.println(Math.pow(x, 2));
      System.out.println(Math.pow(y, 2));
   }
}