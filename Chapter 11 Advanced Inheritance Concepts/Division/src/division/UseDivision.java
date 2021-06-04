package division;

public class UseDivision {
	public static void main(String[] args) {
		InternationalDivision intl = new InternationalDivision("Apple", 12234, "US", "English");
		DomesticDivision dom = new DomesticDivision("IBM", 23321, "NY");
		
		intl.display();
		System.out.println(); //spacing
		dom.display();
	}
}
