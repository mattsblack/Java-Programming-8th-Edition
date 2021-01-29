import java.util.Scanner;
public class Majors {
	enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String QUIT = "999";
		String input;
		for(Major maj : Major.values()) {
			System.out.println(maj);
		}
		System.out.println("Enter a major to see which division it is in: ");
		input = sc.nextLine().toUpperCase();
		while(!input.equals(QUIT)) {
				Major selectedMajor = Major.valueOf(input);
				switch(selectedMajor) {
				case ACC:
				case CIS:
					System.out.println("Business Division");
					break;
				case CHEM:
				case PHYS:
					System.out.println("Science Division");
					break;
				case ENG:
				case HIS:
					System.out.println("Humanities Division");
					break;
				}
			System.out.println("Enter a major to see which division it is in or enter 999 to quit: ");
			input = sc.nextLine().toUpperCase();
		}
	}
}
