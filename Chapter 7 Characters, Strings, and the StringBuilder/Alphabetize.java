import java.util.Scanner;
public class Alphabetize {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str1 = input.nextLine();
      System.out.println("Enter a string: ");
      String str2 = input.nextLine();
      System.out.println("Enter a string: ");
      String str3 = input.nextLine();
      if(str1.compareToIgnoreCase(str2) < str2.compareToIgnoreCase(str1)) {
         if(str2.compareToIgnoreCase(str3) < str3.compareToIgnoreCase(str2)) {
            System.out.println("The strings were in alphabetical order.");
         }
      }
      else {
         System.out.println("The strings were not in alphabetical order.");
      }
   }
}