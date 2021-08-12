import java.util.Scanner;
public class EvenEntryLoop {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter an even number: ");
      int num = s.nextInt();
      while(num != 999) {
         if(num % 2 == 0) {
         System.out.println("Good job! Please enter another number.");
         System.exit(0);
         }
         if(num % 2 != 0) {
            System.out.println("Error. Please enter a new number.");
            System.exit(0);
         }
      }
   }
}