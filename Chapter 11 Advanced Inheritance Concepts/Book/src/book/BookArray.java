package book;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book[] bookArray = new Book[10];
		boolean isFiction;
		String title;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < bookArray.length; i++) {
			System.out.print("Is the book fiction? ");
			isFiction = sc.nextBoolean();
			sc.nextLine();
			System.out.print("Enter the book's title: ");
			title = sc.nextLine();
			if(isFiction) {
				bookArray[i] = new Fiction(title);
			}
			else {
				bookArray[i] = new NonFiction(title);
			}
		}
		System.out.println("Books: ");
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i] instanceof Fiction) {
				System.out.println("Book " + (i+1) + " is Fiction");
				System.out.println("Title: " + bookArray[i].getTitle() + "\n");
				System.out.println("Price: " + bookArray[i].getPrice() + "\n");
			}
			else {
				System.out.println("Book " + (i+1) + " is Non Fiction");
				System.out.println("Title: " + bookArray[i].getTitle() + "\n");
				System.out.println("Price: " + bookArray[i].getPrice() + "\n");
			}
		}
		sc.close();
	}
}