package blanket;

public class Blanket {
	private String size;
	private String color;
	private String material;
	protected double price;
	
	public Blanket() {
		size = "Twin";
		color = "white";
		material = "cotton";
		price = 30.00;
	}
	
	public void setSize(String s) {
		size = s;
		if(s.equalsIgnoreCase("double")) {
			price += 10;
		}
		else if(s.equalsIgnoreCase("queen")) {
			price += 25;
		}
		else if(s.equalsIgnoreCase("king")) {
			price += 40;
		}
		else {
			price = 30;
		}
		
	}
	public void setColor(String c) {
		color = c;
		
	}
	public void setMaterial(String m) {
		material = m;
		if(m.equalsIgnoreCase("wool")) {
			price += 20;
		}
		else if(m.equalsIgnoreCase("cashmere")) {
			price += 45;
		}
		else {
			price = 30;
		}
	}
	public String toString() {
		return "Size: " + size + "\nColor: " + color + "\nMaterial: " +  material + "\nPrice: $" + price;
	}
}
