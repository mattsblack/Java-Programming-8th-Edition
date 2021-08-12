import java.util.Scanner;
public class ValidatePassword {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int stringLen, upperCount = 0, lowerCount = 0, count = 0;
      String password;
      boolean isValid = false;
      do {
         System.out.println("Enter a password: ");
         password = input.nextLine();
         stringLen = password.length();
         for(int i = 0; i < stringLen; i++) {
            if(Character.isUpperCase(password.charAt(i))) {
               upperCount++;
            }
            if(Character.isLowerCase(password.charAt(i))) {
               lowerCount++;
            }
            if(Character.isDigit(password.charAt(i))) {
               count++;
            }
         }
         if(upperCount >= 2 && lowerCount >= 3 && count >= 1) {
            System.out.println("Valid password");
            isValid = true;
         }
         if(upperCount < 2 || lowerCount < 3 || count < 1) {
            System.out.println("The password didn't have enough of the following: ");
            if(upperCount < 2) {
               System.out.print("uppercase letters\n");
            }
            if(lowerCount < 3) {
               System.out.print("lowercase letters\n");
            }
            if(count < 1) {
               System.out.print("digits\n");
            }
         }
      } while(!isValid);
   }
}