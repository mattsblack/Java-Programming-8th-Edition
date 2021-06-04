
public class Life extends Insurance {

	public Life() {
		super("Life");
	}

	@Override
	public void setCost() {
		monthlyPrice = 36;
		
	}

	@Override
	public void display() {
		System.out.println("Insurance Type: " + this.getInsurance() 
							+ "\nMonthly Cost: $" + this.getMonthlyPrice());
		
	}

}
