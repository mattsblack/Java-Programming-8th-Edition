
public class Health extends Insurance {

	public Health() {
		super("Health");

	}

	@Override
	public void setCost() {
		monthlyPrice = 196;
		
	}

	@Override
	public void display() {
		System.out.println("Insurance Type: " + this.getInsurance() 
							+ "\nMonthly Cost: $" + this.getMonthlyPrice());
		
	}

}
