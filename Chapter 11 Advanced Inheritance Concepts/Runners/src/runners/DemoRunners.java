package runners;

public class DemoRunners {
	public static void main(String[] args) {
		Machine m = new Machine();
		Athlete a = new Athlete();
		PoliticalCandidate pc = new PoliticalCandidate();
		
		m.run();
		a.run();
		pc.run();
	}
}
