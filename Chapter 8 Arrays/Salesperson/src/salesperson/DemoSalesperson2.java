package salesperson;

public class DemoSalesperson2 {

	public static void main(String[] args) {
		int i;
		int id = 111;
		double salesAmount = 25_000;
		Salesperson[] people = new Salesperson[10];
		for(i = 0; i < people.length; ++i) {
			people[i] = new Salesperson();
		}
		for(i = 0; i < people.length; ++i) {
			if(i == 0) {
				people[i].setID(id);
				people[i].setAnnualSalesAmount(salesAmount);
			}
			else {
			 people[i].setID(id+=1);
			 people[i].setAnnualSalesAmount(salesAmount+=5_000);
			}
		}
		for(i = 0; i < people.length; ++i) {
			System.out.println("Salesperson " + (i+1) + ":");
			System.out.println("ID: " + people[i].getID());
			System.out.println("Annual Sales Amount: " + people[i].getAnnualSalesAmount());
			System.out.println();
		}
	}

}
