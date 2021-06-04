import java.util.*;
public class DistanceFromAverage {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      final int QUIT = 99999;
      double[] array = new double[20];
      int x = 1, y = 0, total = 0, entry;
      double average;
      System.out.println("Enter an integer or 99999 to quit: ");
      entry = input.nextInt();
      if(entry == QUIT) {
    	  System.out.println("Enter a value.");
      }
      while(entry != QUIT && x < array.length) {
    	  array[x] = entry;
    	  total += entry;
    	  System.out.println("Enter an integer or 99999 to quit: ");
    	  entry = input.nextInt();
    	  if(entry == QUIT)
    		  break;
    	  x++;
      }
      average = (double)total / x;
      System.out.println("You entered " + x + " numbers and the average is " + average);
      for(y = 1; y < x; ++y) {
    	  System.out.println(array[y] + " is " + (array[y] - average) + " away from the average.");
      }
      input.close();
   }
}