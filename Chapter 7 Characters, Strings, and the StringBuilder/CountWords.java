import java.util.Scanner;
public class CountWords {
   public static void main(String args[]) {
      Scanner strInput = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String input = strInput.nextLine();
      input = input.replace(" ", ".");
      input = input.replace(",", ".");
      input = input.replace(";", ".");
      input = input.replace("?", ".");
      input = input.replace("!", ".");
      input = input.replace("-", ".");
      int i, wordCount = 0, strLen = input.length();
      boolean previousCharWasPunc = false;
      for(i = 0; i < strLen; i++) {
         char ch = input.charAt(i);
         if(ch == '.') {
            if(!previousCharWasPunc) {
               ++wordCount;
            }
            previousCharWasPunc = true;
         }
         else {
            previousCharWasPunc = false;
         }
      }
      if(input.charAt(strLen - 1) != '.') {
         ++wordCount;
      }
      System.out.println("There are " + wordCount + " words in the string.");
   }
}