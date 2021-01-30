package candle;

public class Candle {
	private String color;
	protected int height;
	protected double price;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setHeight(int height) {
		this.height = height;
		price = height * 0.393701 * 2;
	}
	public String getColor() {
		return color;
	}
	public int getHeight() {
		return height;
	}
	public double getPrice() {
		return price;
	}
}
