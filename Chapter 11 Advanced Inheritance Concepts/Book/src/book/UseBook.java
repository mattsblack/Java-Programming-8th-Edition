package book;

public class UseBook {

	public static void main(String[] args) {
		Fiction f = new Fiction("book 1");
		NonFiction nf = new NonFiction("book 2");
		
		System.out.println("Title: " + f.getTitle());
		System.out.println("Price: " + f.getPrice());
		System.out.println("Title: " + nf.getTitle());
		System.out.println("Price: " + nf.getPrice());

	}

}
