
public class Apartment {
	final int APT_NUM_LENGTH = 3;
	final int LOW_BDRM_AMT = 1;
	final int HIGH_BDRM_AMT = 4;
	final int LOW_RENT = 500;
	final int HIGH_RENT = 2500;
	
	private String address;
	private int apartmentNum;
	private int bedrooms;
	private int rent;
	
	public Apartment() {
		address = "";
		apartmentNum = 1;
		bedrooms = 0;
		rent = 0;
	}
	public Apartment(String add, int num, int bdrms, int rentAmount) throws ApartmentException {
		String message = "";
		int numDigits = String.valueOf(num).length();
		if(numDigits != APT_NUM_LENGTH) {
			message += "\nApartment number must be three digits.";
		}
		if(bdrms < LOW_BDRM_AMT || bdrms > HIGH_BDRM_AMT) {
			message += "\nBedrooms out of range.";
		}
		if(rentAmount < LOW_RENT || rentAmount > HIGH_RENT) {
			message += "\nRent out of range";
		}
		//check if apartment num contains any non digits
		for(int i = 0; i < numDigits; i++)
		if(!Character.isDigit(String.valueOf(num).charAt(i))) {
			message += "\nNon digit in apartment number.";
		}
		if(!message.equals("")) {
			throw new ApartmentException(message + "\n " + add + "Apartment #" + num
										+ " " + bdrms + " bedrooms.\nRent $" + rentAmount);
		}
		address = add;
		apartmentNum = num;
		bedrooms = bdrms;
		rent = rentAmount;
	}
	public String toString() {
		return address + " #" + apartmentNum + " " + bedrooms + " bedrooms.\nRent $" + rent;
	}
}
