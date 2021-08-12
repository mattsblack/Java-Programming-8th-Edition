import java.util.Scanner;
public class QuartsToGallonsWithExceptionHandling {
   public static void main(String[] args) {
      final int quartingallon = 4;
      Scanner input = new Scanner(System.in);
      int quartforpaint = 0;
      try {
    	  System.out.println("How many quarts of paint are needed for a paint job?");
    	  quartforpaint = input.nextInt();
    	  
      }
      catch(Exception e) {
    	  System.out.println("Error: nonnumeric value entered.");
      }
      float numGal = quartforpaint/quartingallon;
      System.out.println("Number of gallons of paint needed for a paint job: " + numGal);
      input.close();
   }
}