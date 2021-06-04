package newspapersubscription;

public abstract class NewspaperSubscription {
	private String name;
	protected String address;
	protected int rate;
	
	public NewspaperSubscription() {
		name = null;
		address = null;
		rate = 0;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public abstract void setAddress(String a);
	
	public String getAddress() {
		return address;
	}
	public int getRate() {
		return rate;
	}
}
