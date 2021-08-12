package blanket;

public class DemoBlankets {

	public static void main(String[] args) {
		Blanket b = new Blanket();
		ElectricBlanket eb = new ElectricBlanket();
		
		b.setSize("queen");
		b.setColor("blue");
		b.setMaterial("cashmere");
		
		eb.setSize("king");
		eb.setColor("red");
		eb.setMaterial("wool");
		eb.setHeatSettings(3);
		eb.setAutoShutoff(true);
		
		System.out.println(b.toString());
		System.out.println();
		System.out.println(eb.toString());

	}

}
