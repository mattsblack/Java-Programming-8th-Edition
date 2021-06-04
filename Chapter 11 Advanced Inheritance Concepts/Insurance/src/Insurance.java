
public abstract class Insurance {
	private String insurance;
	protected double monthlyPrice;
	
	public Insurance(String insurance) {
		this.insurance = insurance;
	}
	
	//get methods
	public String getInsurance() {
		return insurance;
	}
	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	
	public abstract void setCost();
	public abstract void display();
}
