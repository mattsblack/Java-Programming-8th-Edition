import java.util.Scanner;
public class TicketNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int ticketNum;
      System.out.println("Enter ticket number: ");
      ticketNum = input.nextInt();
      int removeDigit = ticketNum/10;
      int lostDigit = ticketNum%10;
      int remainderTicket = removeDigit%7;
      if(lostDigit == remainderTicket) {
         System.out.println("Ticket is valid");
         }
      else {
      System.out.println("Ticket is invalid");
      }
   }
}