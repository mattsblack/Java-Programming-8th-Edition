import java.util.Scanner;
public class PhoneNumberFormat {
   public static void main(String args[]) {
      int numbersEntered;
      StringBuilder phoneNum = new StringBuilder();
      Scanner input = new Scanner(System.in);
      do {
         System.out.println("Enter a phone number or 999 to quit: ");
         phoneNum.append(input.nextLine());
         numbersEntered = phoneNum.length();
         if(numbersEntered < 10 || numbersEntered > 10) {
            System.out.println("Error: Phone number must be exactly 10 digits long.");
            break;
         }
         phoneNum.insert(0,'(');
         phoneNum.insert(4,')');
         phoneNum.insert(5, ' ');
         phoneNum.insert(9, '-');
         System.out.println(phoneNum);
         System.out.println();
      } while(phoneNum.toString() != "999");
   }
}