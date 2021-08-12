import java.util.Scanner;
public class SalespersonSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salesperson[] people = new Salesperson[7];
		for(int i = 0; i < people.length; i++) {
			int j = i + 1;
			System.out.println("Enter salesperson " + j + "'s ID: ");
			int id = sc.nextInt();
			System.out.println("Enter annual sales amount: ");
			double salesAmount = sc.nextDouble();
			people[i] = new Salesperson(id, salesAmount);
		}
		
		//sort
		int choice;
		do {
			System.out.println("Enter 1 to sort by ID and 2 to sort by sales value: ");
			choice = sc.nextInt();
			if(choice > 0 && choice < 3) {
				int a, b;
				int high = people.length - 1;
				for(a = 0; a < high; a++) {
					for(b = 0; b < high; b++) {
						int c = b + 1;
						
						//sort by ID
						if(choice == 1) {
							if(people[b].getID() > people[c].getID()) {
								Salesperson temp = people[b];
								people[b] = people[c];
								people[c] = temp;
							}
						}
						
						// sort by sales amount
						else if(choice == 1) {
							if(people[b].getAnnualSalesAmount() > people[c].getAnnualSalesAmount()) {
								Salesperson temp = people[b];
								people[b] = people[c];
								people[c] = temp;
							}
						}
						
					}
				}
		
			}
		}while(choice < 1 || choice > 2);
		
		//add space
		System.out.println();
		
		//display output
		for(int i = 0; i < people.length; i++) {
			System.out.println("Salesperson " + (i+1) + ":" + "\nID: " + people[i].getID() + "\nAnnual Sales Amount: " +
									people[i].getAnnualSalesAmount());
		}
	}
}