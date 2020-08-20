import java.util.Scanner;
public class PigLatin {
   static boolean isVowel(char c) { 
      return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'); 
   }
   
   static String pigLatin(String s) {
      int len = s.length(), i, index = -1;
      for(i = 0; i < len; i++) {
         if(isVowel(s.charAt(i))) {
            index = i;
            break;
         }
      }
      if(index == -1) {
         return "-1";
      }
      return s.substring(index) + s.substring(0,index) + "ay";
   }
      
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = input.nextLine();
      String pigStr = pigLatin(str);
      if(pigStr == "-1") {
         System.out.println("No vowels. Pig Latin not possible.");
      }
      else {
         System.out.println(pigStr);
      }
   }
}