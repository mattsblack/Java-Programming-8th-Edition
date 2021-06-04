package element;

public abstract class Element {
	private String symbol;
	private int atomicNumber;
	private int atomicWeight;
	
	public Element(String sym, int num, int weight) {
		symbol = sym;
		atomicNumber = num;
		atomicWeight = weight;
	}
	public String getSymbol() {
		return symbol;
	}
	public int getNumber() {
		return atomicNumber;
	}
	public int getWeight() {
		return atomicWeight;
	}
	
	public abstract void describeElement();
}
