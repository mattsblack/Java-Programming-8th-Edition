import java.util.Scanner;
public class MetricConversion {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = s.nextInt();
      inchToCenti(num);
      litToGal(num);
   }
   public static void inchToCenti(int num) { 
      final double centiInch = 2.54;
      double inchConvert = (double)num * centiInch;
      System.out.println("There are " + inchConvert + " centimeters in " + num + " inches.");
   }
   public static void litToGal(int num) {
      final double literGal = 3.7854; 
      double litConvert = num * literGal;
      System.out.println("There are " + litConvert + " liters in " + num + " gallons.");
   }
}