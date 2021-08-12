
public class ThrowUsedCarExceptions {

	public static void main(String[] args) {
		//create used car array
		UsedCar[] usedCars = new UsedCar[7];
		
		//add values to each used car in the array
		try {
			usedCars[0] = new UsedCar("5000", "Honda", 2003, 60000, 20000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[1] = new UsedCar("3400", "Kia", 1983, 5000, -22220);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[2] = new UsedCar("5123", "Other", 2021, 5320, 40000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[3] = new UsedCar("2251", "Ford", 1999, 152000, 12000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[4] = new UsedCar("330", "Honda", 2008, 50000, 32000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[5] = new UsedCar("0100", "Jeep", 2000, 15000, 43000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		try {
			usedCars[6] = new UsedCar("5000", "Other", 2011, -60000, 12000);
		}
		catch(UsedCarException e) {
			System.out.println(e.getMessage());
		}
		
		//display the valid used cars
		for (int i = 0; i < usedCars.length; i++) {
			if(usedCars[i] != null) {
				System.out.println(usedCars[i].toString() + " is a valid car.");
			}
		}
	}

}
