import java.util.Scanner;
public class CategorizeStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strings = new String[10];
		int counterShort = 0, counterLong = 0;
		StringBuilder shortString = new StringBuilder();
		StringBuilder longString = new StringBuilder();
		for(int i = 0; i < strings.length; ++i) {
			System.out.print("Enter a string: ");
			System.out.println();
			strings[i] = input.nextLine();
			if(strings[i].length() <= 10) {
				shortString.append(strings[i] + " ");
				++counterShort;
			}
			else {
				longString.append(strings[i] + " ");
				++counterLong;
			}
		}
			System.out.print("Enter s to display short strings and l to display long strings: ");
			String choice = input.nextLine().toLowerCase();
			switch(choice) {
				case "s":
					if(counterShort == 0)
						System.out.println("There are no strings shorter than 10 characters in this list");
					else 
						System.out.println(shortString);
					break;
				case "l":
					if(counterLong == 0)
						System.out.println("There are no strings longer than 10 characters in this list.");
					else
						System.out.println(longString);
					break;
			}
		input.close();
	}
}
