import java.util.Scanner;
public class Palindrome {
   static boolean isPalindrome(String str) {
      int i = 0, j = str.length() - 1;
      while(i<j) {
         if(str.charAt(i) != str.charAt(j)) {
            return false;   
         }
         i++;
         j--;
     }
     return true;
   }
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = input.nextLine();
      if(isPalindrome(str)) {
         System.out.println("This is a palindrome.");
      }
      else {
         System.out.println("Not a palindrome.");
      }
   }
}