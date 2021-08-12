import java.util.Scanner;

public class SortPurchasesArray {

	public static void main(String[] args) {
		final int QUIT = 999;
		Purchase[] p = new Purchase[5];
		Scanner sc = new Scanner(System.in);
		int input = 0;
		for(int i = 0; i < p.length; i++) {
			p[i] = new Purchase();
			System.out.print("Enter purchase sales amount: ");
			p[i].setsaleAmount(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter invoice num: ");
			p[i].setinvoiceNum(sc.nextInt());
			sc.nextLine();
		}
		while(input != QUIT) {
			System.out.println("Enter 1 to sort purchase objects by invoice number" + "\nor enter 2 to sort by sale amount order " + "\nor enter 999 to quit: ");
			input = sc.nextInt();
			display(p,input);
		}
	}
	
	public static void display(Purchase[] purchase, int option) {
		int a, b, i;
		Purchase temp;
		switch(option) {
			case 1:
				a = 1;
				while(a < purchase.length) {
					temp = purchase[a];
					b = a - 1;
					while(b >= 0 && purchase[b].getinvoiceNum() > temp.getinvoiceNum()) {
						purchase[b+1] = purchase[b];
						--b;
					}
					purchase[b+1] = temp;
					++a;
				}
				System.out.println("List sorted by invoice number: ");
				break;
			case 2: 
				a = 1;
				while(a < purchase.length) {
					temp = purchase[a];
					b = a-1;
					while(b >= 0 && purchase[b].getsaleAmount() > temp.getsaleAmount()) {
						purchase[b+1] = purchase[b];
						--b;
					}
					purchase[b+1] = temp;
					++a;
				}
				System.out.println("List sorted by sales amount: ");
				break;
			default:
				System.out.println("Invalid option. Here is the unsorted list: ");
				break;
		}
		for(i = 0; i < purchase.length; i++) {
			System.out.println("Invoice number: " + purchase[i].getinvoiceNum() + "\n" +
						"Sales amount: " + purchase[i].getsaleAmount());
		}
	}

}
