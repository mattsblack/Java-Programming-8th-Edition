import java.util.Scanner;
public class RandomGuessMatch {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int random = 1 + (int)(Math.random() * 5);
      System.out.println("Guess a number between 1 and 5: ");
      int guess = input.nextInt();
      System.out.println("The random number is: " + random);
      if(guess == random) {
         System.out.println("Guess is equal to the random number");
       }
     else {
         System.out.println("Guess is not equal to the random number");
       }
      System.out.println("Difference between random number and your guess: " + Math.abs((random - guess)));
   }
}