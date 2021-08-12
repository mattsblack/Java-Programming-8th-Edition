import java.util.*;
public class DistanceFromAverageWithExceptionHandling {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      final int QUIT = 99999;
      double[] array = null;
      int x = 1, y = 0, total = 0, entry = 0, size = 0;
      boolean validArray = true, valCheck = false;
      double average;
      try {
    	  System.out.print("Enter array size: ");
    	  size = input.nextInt();
      }
      catch(Exception e) {
    	  System.out.println("Error: Invalid array size.");
    	  validArray = false;
    	  input.nextLine();
      }
      while(size < 0) {
    	  System.out.println("Size cannot be negative. Size is set to 20");
    	  size = 20;
    	  input.nextLine();
      }
      if(validArray) {
    	  array = new double[size];
    	  while(!valCheck) {
    		  try {
    			  System.out.print("Enter a value or " + QUIT + " to quit:");
    			  entry = input.nextInt();
    			  valCheck = true;
    		  }
    		  catch(Exception e) {
    			  valCheck = false;
    			  input.nextLine();
    		  }
    	  }
    	  while(entry != QUIT && x < array.length) {
        	  array[x] = entry;
        	  total += entry;
        	  if(x < array.length) {
        		  try {
        			  System.out.print("Enter next value or " + QUIT + " to quit:");
        			  entry = input.nextInt();
        		  }
        		  catch(Exception e) {
        			  System.out.print("Error: invalid input. Please reenter value " + x);
        			  --x;
        			  entry = input.nextInt();
        		  }
        	  }
        	  System.out.println("Enter an integer or 99999 to quit: ");
        	  entry = input.nextInt();
        	  if(entry == QUIT)
        		  break;
        	  x++;
          }
      }
      System.out.println("Enter an integer or 99999 to quit: ");
      entry = input.nextInt();
      if(entry == QUIT) {
    	  System.out.println("Enter a value.");
      }
      
      average = (double)total / x;
      System.out.println("You entered " + x + " numbers and the average is " + average);
      for(y = 1; y < x; ++y) {
    	  System.out.println(array[y] + " is " + (array[y] - average) + " away from the average.");
      }
      input.close();
   }
   
}