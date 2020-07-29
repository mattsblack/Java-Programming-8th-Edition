import java.util.Scanner;
public class BarChart {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int artPoints, bobPoints, calPoints, danPoints, eliPoints, i;
      System.out.println("Enter points scored by Art >> ");
      artPoints = s.nextInt();
      System.out.println("Enter points scored by Bob >> ");
      bobPoints = s.nextInt();
      System.out.println("Enter points scored by Cal >> ");
      calPoints = s.nextInt();
      System.out.println("Enter points scored by Dan >> ");
      danPoints = s.nextInt();
      System.out.println("Enter points scored by Eli >> ");
      eliPoints = s.nextInt();
      System.out.println("Points for Game:");
      System.out.println();
      
      System.out.print("Art ");
      for(i = 0; i < artPoints; ++i) {
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("Bob ");
      for(i = 0; i < bobPoints; ++i) {
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("Cal ");
      for(i = 0; i < calPoints; ++i) {
         System.out.print("*");
      }
      System.out.println();

      System.out.print("Dan ");
      for(i = 0; i < danPoints; ++i) {
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("Eli ");
      for(i = 0; i < eliPoints; ++i) {
         System.out.print("*");
      }
   }
}