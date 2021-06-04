package phonecall;

public class IncomingPhoneCall extends PhoneCall {

	public IncomingPhoneCall(String pnum) {
		super(pnum);
		price = 0.02;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public double getPrice() {
		return price;
	}
	public void getInfo() {
		System.out.println("Phone Number: " + this.getPhoneNumber());
		System.out.println("Rate: " + this.getPrice());
		System.out.println("Price: $" + this.getPrice());
	}

}
