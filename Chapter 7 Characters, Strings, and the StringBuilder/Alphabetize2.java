import java.util.Scanner;
public class Alphabetize2 {
   public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a string: ");
     String str1 = input.nextLine();
     System.out.println("Enter a string: ");
     String str2 = input.nextLine();
     System.out.println("Enter a string: ");
     String str3 = input.nextLine();
     if(str1.compareToIgnoreCase(str2) < 0) {
       if(str2.compareToIgnoreCase(str3) < 0) {
         System.out.println(str1 + "\n" + str2 + "\n" + str3);
       }
       else if(str1.compareToIgnoreCase(str3) < 0) {
         System.out.println(str1 + "\n" + str3 + "\n" + str2);
       }
       else {
         System.out.println(str3 + "\n" + str1 + "\n" + str2);
       }
     }
     else if(str3.compareToIgnoreCase(str2) < 0) {
         System.out.println(str3 + "\n" + str2 + "\n" + str1);
     }
     else if(str1.compareToIgnoreCase(str3) < 0) {
         System.out.println(str2 + "\n" + str1 + "\n" + str3);
     }
     else {
         System.out.println(str2 + "\n" + str3 + "\n" + str1);
     }    
   }
}