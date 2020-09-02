package salesperson;

public class DemoSalesperson {

	public static void main(String[] args) {
		int id = 9999;
		double salesAmount = 0;
		Salesperson[] person = new Salesperson[10];
		int i;
		for(i = 0; i < person.length; ++i) {
			person[i] = new Salesperson();
		}
		for(i = 0; i < person.length; ++i) {
			person[i].setID(id);
			person[i].setAnnualSalesAmount(salesAmount);
		}
		//display each object's values
		for(i = 0; i < person.length; ++i) {
			System.out.println("Salesperson " + (i+1) + ":");
			System.out.println("ID: " + person[i].getID());
			System.out.println("Annual Sales Amount: " + person[i].getAnnualSalesAmount());
			System.out.println();
		}

	}

}
