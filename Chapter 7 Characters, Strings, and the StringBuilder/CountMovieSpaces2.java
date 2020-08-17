import java.util.Scanner;
public class CountMovieSpaces2 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a movie quote: ");
      String quote = input.nextLine();
      int count = 0;
      for(int i = 0; i<quote.length(); i++) {
         if(quote.charAt(i) == ' ') {
            count++;
         }
      }
      System.out.println("The number of spaces in the quote is: " + count);
   }
}