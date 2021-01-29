public class Salesperson {
	private int ID = 0;
	private double annualSalesAmount;
	public Salesperson() {
		ID = 0;
		annualSalesAmount = 0;
	}
	public Salesperson(int ID, double annualSalesAmount) {
		this.ID = ID;
		this.annualSalesAmount = annualSalesAmount;
	}
	public void setID(int id) {
		ID = id;
	}
	public void setAnnualSalesAmount(double salesAmount) {
		annualSalesAmount = salesAmount;
	}
	public int getID() {
		return ID;
	}
	public double getAnnualSalesAmount() {
		return annualSalesAmount;
	}
}