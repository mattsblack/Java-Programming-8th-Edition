package horse;

public class DemoHorses {
	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.setName("Billy");
		h1.setColor("Black");
		h1.setBirthYear(2000);
		RaceHorse h2 = new RaceHorse();
		h2.setName("Bob");
		h2.setColor("Brown");
		h2.setBirthYear(2010);
		h2.setRacesCompleted(10);
		
		//display values for horse
		System.out.println("Name: " + h1.getName());
		System.out.println("Color: " + h1.getColor());
		System.out.println("Birth Year: " + h1.getBirthYear());
		
		//display values for race horse
		System.out.println("Name: " + h2.getName());
		System.out.println("Color: " + h2.getColor());
		System.out.println("Birth Year: " + h2.getBirthYear());
		System.out.println("Races Completed: " + h2.getRacesCompleted());
	}
}
