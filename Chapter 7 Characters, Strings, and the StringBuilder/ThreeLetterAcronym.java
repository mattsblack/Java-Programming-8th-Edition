import java.util.Scanner;
public class ThreeLetterAcronym {
   public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     //get input
     System.out.println("Enter a string: ");
     String str1 = input.nextLine();
     System.out.println("Enter a string: ");
     String str2 = input.nextLine();
     System.out.println("Enter a string: ");
     String str3 = input.nextLine();
     StringBuilder tla = new StringBuilder();
     
     //take the first letter of each word and add it to the acronym string
     tla = tla.append(str1.charAt(0));
     tla = tla.append(str2.charAt(0));
     tla = tla.append(str3.charAt(0));
     //print string in upper case
     System.out.println(tla.toString().toUpperCase());
   }
}