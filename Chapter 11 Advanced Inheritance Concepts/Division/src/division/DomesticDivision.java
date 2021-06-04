package division;

public class DomesticDivision extends Division {
	private String state;
	
	public DomesticDivision(String name, int num, String state) {
		super(name, num);
		this.state = state;
	}

	@Override
	public void display() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("State: " + state);
	}

}
