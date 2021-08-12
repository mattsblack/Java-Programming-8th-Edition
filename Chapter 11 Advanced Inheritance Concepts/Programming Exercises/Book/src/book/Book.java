package book;

public abstract class Book {
	protected String title;
	protected double price;
	
	public Book(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public abstract void setPrice();
}