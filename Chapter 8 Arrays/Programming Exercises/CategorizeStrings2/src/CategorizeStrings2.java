import java.util.Arrays;
import java.util.Scanner;

public class CategorizeStrings2 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String[] oneSpace = new String[10];
			String[] noSpace = new String[10];
			String[] moreSpaces = new String[10];
			String string;
			int counterSpace = 0, i;
			int counterNoSpaces = 0;
			int counterOneSpace = 0;
			int counterMoreSpaces = 0;
			final String NOSPACES = "NO SPACES";
			final String ONESPACE = "ONE SPACE";
			final String MORESPACES = "MORE SPACES";
			final String QUIT = "Quit";
			
			System.out.print("Enter first word or Quit to quit: ");
			string = input.nextLine();
			while(!string.equalsIgnoreCase(QUIT)) {
				for(i = 0; i < string.length(); ++i) {
					if(Character.isWhitespace(string.charAt(i))) {
						++counterSpace;
					}
				}
				switch(counterSpace) {
					case 0:
						for(i = 0; i < noSpace.length; ++i) {
							if(noSpace[i] == null) {
								noSpace[i] = string;
								++counterNoSpaces;
								break;
							}
						}
					case 1:
						for(i = 0; i < oneSpace.length; ++i) {
								if(oneSpace[i] == null) {
									oneSpace[i] = string;
									++counterOneSpace;
									break;
								}
						}
					default:
						for(i = 0; i < moreSpaces.length; ++i) {
							if(moreSpaces[i] == null) {
								moreSpaces[i] = string;
								++counterMoreSpaces;
								break;
							}
						}
				}
				counterSpace = 0;
				System.out.println("Enter another word or Quit to quit: ");
				string = input.nextLine();
			}
				
			System.out.print("Enter what type of string list you want to see: ");
			String choice = input.nextLine().toUpperCase();
			while(!string.equalsIgnoreCase(QUIT)) {
				switch(choice) {
				case NOSPACES:
					System.out.println(Arrays.toString(Arrays.copyOf(noSpace, counterNoSpaces)));
					break;
				case ONESPACE:
					System.out.println(Arrays.toString(Arrays.copyOf(oneSpace, counterOneSpace)));
					break;
				case MORESPACES:
					System.out.println(Arrays.toString(Arrays.copyOf(moreSpaces, counterMoreSpaces)));
					break;
				default:
					System.out.println("No spaces:\n"+Arrays.toString(Arrays.copyOf(noSpace,counterNoSpaces))+"\n"+
                            "One space:\n"+Arrays.toString(Arrays.copyOf(oneSpace,counterOneSpace))+"\n"+
                            "More than one space:\n"+Arrays.toString(Arrays.copyOf(moreSpaces,counterMoreSpaces)));
				}
			}
		input.close();
	}
}
