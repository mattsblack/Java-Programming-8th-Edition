public class Percentages {
   public static void main(String[] args) {
      double a = 3.2;
      double b = 6.4;
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