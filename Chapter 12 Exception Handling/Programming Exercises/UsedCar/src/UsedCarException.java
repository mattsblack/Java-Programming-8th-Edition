
public class UsedCarException extends Exception {
	public UsedCarException(String vin) {
		super("Problems with VIN: " + vin);
	}
}
