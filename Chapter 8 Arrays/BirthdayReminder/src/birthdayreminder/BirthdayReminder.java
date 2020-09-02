package birthdayreminder;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class BirthdayReminder {
	public static void main(String args[]) {
		final String sentinel = "ZZZ";
		int nameCount = 0;
		int birthdayCount = 0;
		int count = 0;
		int MAX = 10;
		boolean didFind;
		String enteredName;
		String enteredBirthday;
		Scanner input = new Scanner(System.in);
		String[] names = new String[10];
		LocalDate[] birthdays = new LocalDate[10];
		System.out.println("Enter a name or ZZZ to quit: ");
		enteredName = input.nextLine();
		while(count < MAX && !enteredName.equalsIgnoreCase(sentinel)) {
			names[nameCount] = enteredName;
			++nameCount;
			System.out.println("Enter birthday for: " + enteredName);
			enteredBirthday = input.nextLine();
			birthdays[birthdayCount] = LocalDate.parse(enteredBirthday);
			++birthdayCount;
			++count;
			if(count < MAX) {
				System.out.println("Enter the next name or ZZZ to quit: ");
				enteredName = input.nextLine();
			}
		}
		names = Arrays.copyOf(names, nameCount);
        birthdays = Arrays.copyOf(birthdays, birthdayCount);
        System.out.println("Please enter a name to check their birthday or ZZZ to quit:");
        enteredName = input.nextLine();
        while(!enteredName.equalsIgnoreCase(sentinel)){
            didFind = false;
            for(int i = 0;i < names.length;++i){
                if(names[i].equalsIgnoreCase(enteredName)){
                    System.out.println("Name: "+names[i]+"\n"+
                        "Birthday: "+birthdays[i]);
                        didFind = true;
                        break;
                }
           }
        if(!didFind) {
        	System.out.println("The name entered is not in the list.");
        }
        System.out.println("Please enter a new name to check their birthday or ZZZ to quit:");
        enteredName = input.nextLine();
        }
		input.close();
	}
}
