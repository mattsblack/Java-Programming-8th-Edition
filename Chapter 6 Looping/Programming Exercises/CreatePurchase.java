import java.util.Scanner;
public class CreatePurchase extends Purchase {
   public static void main(String args[]) {
      int amount, invoice, tax;
      Scanner s = new Scanner(System.in);
      Purchase p = new Purchase();
      do {
      System.out.println("Enter an invoice number: ");
      invoice = s.nextInt();
      } while(invoice <= 1000 || invoice >= 8000);
      setinvoiceNum(invoice);
      do {
      System.out.println("Enter a sale amount: ");
      amount = s.nextInt();
      } while(amount < 0);
      setsaleAmount(amount);
      displayDetails(invoice, amount);
   }
}