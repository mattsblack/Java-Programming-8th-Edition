import java.util.Scanner;
public class DayOfWeek {
	enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	public static void main(String[] args) {
		final String QUIT = "999";
		Scanner sc = new Scanner(System.in);
		String input;
		for(Days day : Days.values()) {
			System.out.println(day);
		}
		System.out.println("Enter a day to get the business hours: ");
		input = sc.nextLine().toUpperCase();
		while(!input.equals(QUIT)) {
			Days enteredDay = Days.valueOf(input);
			switch(enteredDay) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				System.out.println("Business hours are from 9 am to 9 pm.");
				break;
			case SATURDAY:
				System.out.println("Business hours are from 10 am to 6 pm.");
				break;
			case SUNDAY:
				System.out.println("Business hours are from 11 am to 5 pm.");
				break;
			}
			System.out.println("Enter a day to get the business hours or 999 to quit: ");
			input = sc.nextLine().toUpperCase();
		}
		
	}
}