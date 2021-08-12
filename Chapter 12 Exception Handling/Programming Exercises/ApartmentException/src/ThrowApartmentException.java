
public class ThrowApartmentException {

	public static void main(String[] args) {
		Apartment[] apartments = new Apartment[6];
		String[] addresses = {"123 Street", "123 Main", "234 Street", "234 Main", "456 Street", "456 Main"};
		int[] apartmentNums = {213,412,122,322,543,401};
		int[] bedrooms = {3,1,2,0,1,2};
		int[] rentAmounts = {800, 2500, 1500, 250, 1000, 600};
		/*for(int j = 0; j < apartments.length; j++) {
			apartments[j] = new Apartment();
		}*/
		for(int i = 0; i < apartments.length; i++) {
			try {
				apartments[i] = new Apartment(addresses[i], apartmentNums[i], bedrooms[i], rentAmounts[i]);
			}
			catch(ApartmentException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		}
		System.out.println("Apartments: ");
		for(int i = 0; i < apartments.length; ++i) {
			System.out.println(apartments[i].toString());
		}
	}

}
