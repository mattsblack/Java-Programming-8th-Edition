import java.util.Scanner;
public class QuartsToGallonsInteractive {
   public static void main(String[] args) {
      final int quartingallon = 4;
      Scanner input = new Scanner(System.in);
      System.out.println("How many quarts of paint are needed for a paint job?");
      int quartforpaint = input.nextInt();
      float numGal = quartforpaint/quartingallon;
      System.out.println("Number of gallons of paint needed for a paint job " + numGal);
   }
}