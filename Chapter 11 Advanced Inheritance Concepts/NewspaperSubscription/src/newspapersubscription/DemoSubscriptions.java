package newspapersubscription;

public class DemoSubscriptions {

	public static void main(String[] args) {
		OnlineNewspaperSubscription onews = new OnlineNewspaperSubscription();
		PhysicalNewspaperSubscription pnews = new PhysicalNewspaperSubscription();
		onews.setAddress("test@test.com");
		onews.setName("Tom");
		pnews.setAddress("1234 Street St");
		pnews.setName("Mark");
		
		//display info
		System.out.println("Online news address: " + onews.getAddress());
		System.out.println("Online news name: " + onews.getName());
		System.out.println("Online news rate: $" + onews.getRate());
		System.out.println(); //spacing
		System.out.println("Physical news address: " + pnews.getAddress());
		System.out.println("Physical news name: " + pnews.getName());
		System.out.println("Physical news rate: $" + pnews.getRate());
	}

}
