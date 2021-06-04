package element;

public class ElementArray {

	public static void main(String[] args) {
		Element[] elements = new Element[4];
		elements[0] = new MetalElement("Fe", 26, 56);
		elements[1] = new MetalElement("Au", 79, 197);
		elements[2] = new NonMetalElement("O", 8, 16);
		elements[3] = new NonMetalElement("H", 1, 1);
		
		for(int i = 0; i < elements.length; i++) {
			elements[i].describeElement();
			System.out.println(); //spacing
		}
	}

}
