package newspapersubscription;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

	public PhysicalNewspaperSubscription() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAddress(String a) {
		char c;
		boolean hasDigit = false;
		for(int i = 0; i < a.length(); i++){
	        c = a.charAt(i);
	        if(Character.isDigit(c) == true)
	            hasDigit = true;
	    }
		if(!hasDigit) {
			rate = 0;
			System.out.println("Error: address must contain at least one digit.");
		}
		else {
			rate = 15;
			address = a;
		}

	}

}
