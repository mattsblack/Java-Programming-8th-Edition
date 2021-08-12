import java.util.Scanner;
public class CellPhoneService {
   public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      int minutes;
      int messages;
      int gigs;
      System.out.println("How many minutes used? ");
      minutes = s.nextInt();
      System.out.println("How many messages sent? ");
      messages = s.nextInt();
      System.out.println("How many gigabytes of data used? ");
      gigs = s.nextInt();
      if(minutes < 500 && messages == 0 && gigs == 0)
         System.out.println("You should buy Plan A, which costs $49 per month");
      if(minutes < 500 && messages > 0 && gigs == 0)
         System.out.println("You should buy Plan B, which costs $55 per month");
      if(minutes >= 500 && messages <=100 && gigs == 0)
         System.out.println("You should buy Plan C, which costs $61 per month");
      if(minutes >= 500 && messages >= 100 && gigs == 0)
         System.out.println("You should buy Plan D, which costs $70 per month");
      if(minutes >= 0 && messages >= 0 && gigs <= 2 && gigs > 0)
         System.out.println("You should buy Plan E, which costs $79 per month");
      if(minutes >= 0 && messages >= 0 && gigs > 2)
         System.out.println("You should buy Plan F, which costs $81 per month");
  }
}