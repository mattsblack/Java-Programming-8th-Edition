public class CountMovieSpaces {
   public static void main(String args[]) {
      String quote = "I'll be back";
      int count = 0;
      for(int i = 0; i<quote.length(); i++) {
         if(quote.charAt(i) == ' ') {
            count++;
         }
      }
      System.out.println("The number of spaces in the quote is: " + count);
   }
}