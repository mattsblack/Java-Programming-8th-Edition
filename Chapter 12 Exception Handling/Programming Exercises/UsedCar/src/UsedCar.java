
public class UsedCar {
	private String vin;
	private String make;
	private int year;
	private int mileage;
	private int price;
	
	public UsedCar(String vin, String make, int year, int mileage, int price) throws UsedCarException {
		if(vin.length() < 4) {
			throw new UsedCarException(vin);
		}
		if(!(make.equals("Toyota") || make.equals("Honda") || make.equals("Ford") || make.equals("Other"))) {
			throw new UsedCarException(vin);
		}
		if(year < 1990 && year > 2014) {
			throw new UsedCarException(vin);
		}
		if(mileage < 0) {
			throw new UsedCarException(vin);
		}
		if(price < 0) {
			throw new UsedCarException(vin);
		}
		
	}
	
}
