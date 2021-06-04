package newspapersubscription;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

	public OnlineNewspaperSubscription() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAddress(String a) {
		if(a.contains("@")) {
			rate = 9;
			address = a;
		}
		else {
			System.out.println("Error: Must contain '@' in address.");
			rate = 0;
		}

	}

}
