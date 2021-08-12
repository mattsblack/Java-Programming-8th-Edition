package division;

public class InternationalDivision extends Division {
	private String country;
	private String language;
	
	public InternationalDivision(String name, int num, String country, String lang) {
		super(name, num);
		this.country = country;
		language = lang;
	}

	@Override
	public void display() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Country: " + country);
		System.out.println("Language: " + language);
	}

}
