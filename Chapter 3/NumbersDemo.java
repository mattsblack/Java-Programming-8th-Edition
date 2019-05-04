public class NumbersDemo {
   public static void main(String[] args) {
      displayTwiceTheNumber();
      displayNumberPlusFive();
      displayNumberSquared();
   }
   public static void displayTwiceTheNumber() {
      int x = 10;
      int y = 5;
      System.out.println(x * 2);
      System.out.println(y * 2);
   }
   public static void displayNumberPlusFive() {
      int x = 10;
      int y = 5;
      System.out.println(x + 5);
      System.out.println(y + 5);
   }
   public static void displayNumberSquared() {
      int x = 10;
      int y = 5;
      System.out.println(Math.pow(x, 2));
      System.out.println(Math.pow(y, 2));
   }
}