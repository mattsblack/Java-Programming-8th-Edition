package element;

public class MetalElement extends Element {

	public MetalElement(String sym, int num, int weight) {
		super(sym, num, weight);
	}

	@Override
	public void describeElement() {
		System.out.println("Atomic Symbol: " + getSymbol());
		System.out.println("Atomic Number: " + getNumber());
		System.out.println("Atomic Weight: " + getWeight());
		System.out.println("Good conductor of electricity");
	}

}
