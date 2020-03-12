import java.util.Scanner;
public class Percentages2 {
   public static void main(String[] args) {
      double a;
      double b;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter first number: ");
      a = s.nextDouble();
      System.out.println("Enter second number: ");
      b = s.nextDouble();
      double percentA;
      double percentB;
      computePercent(a, b);
      computePercent(b, a);
   }
   public static void computePercent(double a, double b) {
      System.out.println(a);
      System.out.println(b);
      double percentA = (a/b)*100;
      double percentB = (b/a)*100;
      System.out.println(a + " is " + percentA + " percent of " + b);
      System.out.println(b + " is " + percentB + " percent of " + a);
   }
}