package phonecall;

public class DemoPhoneCalls {

	public static void main(String[] args) {
		IncomingPhoneCall ip = new IncomingPhoneCall("555-555-5555");
		OutgoingPhoneCall op = new OutgoingPhoneCall("555-555-5554", 20);
		ip.getInfo();
		System.out.println();
		op.getInfo();
	}

}
