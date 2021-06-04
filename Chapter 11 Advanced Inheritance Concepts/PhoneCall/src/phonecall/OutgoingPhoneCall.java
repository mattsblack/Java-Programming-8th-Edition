package phonecall;

public class OutgoingPhoneCall extends PhoneCall {
	private int time;
	
	public OutgoingPhoneCall(String pnum, int time) {
		super(pnum);
		price = 0.04;
		this.time = time;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public double getPrice() {
		return price;
	}
	
	public int getTime() {
		return time;
	}

	public void getInfo() {
		System.out.println("Phone Number: " + this.getPhoneNumber());
		System.out.println("Rate: " + this.getPrice() + " per minute");
		System.out.println("Call length: " + this.getTime() + " minutes");
		System.out.println("Price: $" + (this.getPrice()*time));
	}

}
