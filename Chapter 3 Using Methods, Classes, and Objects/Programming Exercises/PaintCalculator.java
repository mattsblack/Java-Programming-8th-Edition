import java.util.Scanner;
public class PaintCalculator {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of the room: ");
      int length = s.nextInt();
      System.out.println("Enter the width of the room: ");
      int width = s.nextInt();
      System.out.println("Enter the height of the room: ");
      int height = s.nextInt();
      int area = length * width * height;
      int galPaint = area / 350;
      int paintPrice = galPaint * 32;
      Calculator(length, width, height);
      galPaint(area);
      System.out.println("The cost to paint a " + length + "-by-" + width + "-foot room with " + height + "-foot ceilings is $" + paintPrice);
   }
   public static int Calculator(int length, int width, int height) {
      int area = length * width * height;
      int galPaint = area / 350;
      galPaint(area);
      int paintPrice = galPaint * 32;
      return paintPrice;
   }
   public static int galPaint(int area) {
      int galPaint = area / 350;
      System.out.println("Number of gallons needed to paint the room: " + galPaint);
      return galPaint;
   }
}