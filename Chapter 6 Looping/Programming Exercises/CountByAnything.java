import java.util.Scanner;
public class CountByAnything {
   public static void main(String[] args) {
      int countVal = 0;
      Scanner s = new Scanner(System.in);
      System.out.println("Please enter a number: ");
      int count = s.nextInt();
      for(int i=3; i<=300; i += count) {
         System.out.print(i + " ");
         countVal++;
         if(countVal % 10 == 0) {
            System.out.println("\n");
         }
      }
   }
}