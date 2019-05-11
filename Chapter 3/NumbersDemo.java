public class NumbersDemo {
   public static void main(String[] args) {
      int x = 10;
      int y = 5;
      displayTwiceTheNumber(10, 5);
      displayNumberPlusFive(10, 5);
      displayNumberSquared(10, 5);
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