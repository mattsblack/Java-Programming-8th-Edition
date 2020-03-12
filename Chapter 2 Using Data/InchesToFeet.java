public class InchesToFeet {
   public static void main(String[] args) {
      int inches = 29;
      final int feet = inches/12;
      int remainder = inches%12;
      System.out.println(inches + " inches" + " is equal to " + feet + " feet " + remainder + " inches.");
   }
}