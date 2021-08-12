import java.util.Scanner;
public class Dollars {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      final int twenties;
      final int tens;
      final int fives;
      final int ones;
      System.out.println("Enter number of dollars: ");
      int dollars = input.nextInt();
      twenties = dollars/20;
      dollars = twenties*20;
      tens = dollars/10;
      dollars = tens*10;
      fives = dollars/5;
      dollars = fives*5;
      ones = dollars;
      System.out.println("20's: "+twenties+"\n10's: "+tens+"\n 5's: "+fives+"\n 1's: "+ones);
   }
}