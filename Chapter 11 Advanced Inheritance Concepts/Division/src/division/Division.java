package division;

public abstract class Division {
	protected String companyName;
	protected int accountNumber;
	
	public abstract void display();
	
	public Division(String name, int num) {
		companyName = name;
		accountNumber = num;
	}
}
