package phonenumbers;
import java.util.Scanner;
public class PhoneNumbers {

	public static void main(String[] args) {
		final int MAX = 10;
		final String QUIT = "Quit";
		Scanner input = new Scanner(System.in);
		String[] names = new String[30];
		int[] phones = new int[30];
		boolean isFound;
		String enteredName;
		int enteredPhone, i;
		int count = 0;
		int namesCount = 0;
		System.out.println("Enter the name for the first person: ");
		enteredName = input.nextLine();
		System.out.println("Enter the phone number for " + enteredName + ":");
		enteredPhone = input.nextInt();
		input.nextLine();
		while(count < MAX) {
			names[count] = enteredName;
			++namesCount;
			phones[count] = enteredPhone;
			++count;
			if(count < MAX) {
				System.out.println("Enter the name for the next person: ");
				enteredName = input.nextLine();
				System.out.println("Enter the phone number for " + enteredName + ":");
				enteredPhone = input.nextInt();
				input.nextLine();
			}
		}
		System.out.println("Enter the name you want to see the phone number from: ");
		enteredName = input.nextLine();
		while(namesCount < 30 && !enteredName.equalsIgnoreCase(QUIT)){
            isFound = false;
            for(i = 0;i < names.length;++i){
                if(names[i] != null && names[i].equalsIgnoreCase(enteredName)){
                    isFound = true;
                    System.out.println("The phone number for "+names[i]+" is:\n"+
                            phones[i]);
                }
            }
            if(!isFound && namesCount < 30){
                for(i = 0;i < names.length;++i){
                    if(names[i] == null){
                        names[i] = enteredName;
                        System.out.println("Please enter a phone number for "+enteredName);
                        enteredPhone = input.nextInt();
                        phones[i] = enteredPhone;
                        input.nextLine();
                    }
                }
            }else if(!isFound && namesCount >= 30){
                System.out.println("Sorry "+enteredName+" does not have a phone registered, the entries are full\n"+
                        "So we can't allow you to add new ones either.");
            }
            if(namesCount < 30){
            	System.out.println("Please enter a name that you want to see the phone number from:");
            	enteredName = input.nextLine();
            }
		}
	}
}
