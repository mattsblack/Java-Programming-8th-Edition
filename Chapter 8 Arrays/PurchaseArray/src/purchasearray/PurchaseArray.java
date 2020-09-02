package purchasearray;
import java.util.Scanner;
public class PurchaseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Purchase[] purchase = new Purchase[5];
		int invoiceNum, salesAmount, i;
		for(i = 0; i < purchase.length; ++i) {
			purchase[i] = new Purchase();
			do {
			System.out.println("Enter invoice number: ");
			invoiceNum = scan.nextInt();
			scan.nextLine();
			}while(!(invoiceNum >= 1000) || !(invoiceNum <= 8000));
			purchase[i].setinvoiceNum(invoiceNum);
			do {
				System.out.println("Enter sale amount: ");
				salesAmount = scan.nextInt();
				scan.nextLine();
			}while(salesAmount < 0);
			purchase[i].setsaleAmount(salesAmount);
		}
		for(i = 0; i < purchase.length; ++i) {
			purchase[i].displayDetails();
		}
		scan.close();
	}
}
