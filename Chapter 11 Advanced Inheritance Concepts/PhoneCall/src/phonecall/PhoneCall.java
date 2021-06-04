package phonecall;

public abstract class PhoneCall {
	protected String phoneNumber;
	protected double price;
	
	public PhoneCall(String pnum) {
		phoneNumber = pnum;
		price = 0.0;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public abstract String getPhoneNumber();
	public abstract double getPrice();
	public abstract void getInfo();
}
