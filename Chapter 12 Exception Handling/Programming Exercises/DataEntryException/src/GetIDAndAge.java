import java.util.*;

public class GetIDAndAge {

	public static void main(String[] args) {
		final int QUIT = 0;
		Scanner s = new Scanner(System.in);
		int id, age, placeholder = QUIT + 1;
		while(placeholder != QUIT) {
			try {
				System.out.print("Enter ID: ");
				id = s.nextInt();
				System.out.print("Enter age: ");
				age = s.nextInt();
				placeholder = check(id, age);
			}
			catch(DataEntryException e) {
				System.out.println("Invalid ID or age - " + e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid data type");
				s.nextLine();
			}
			
			
		}
		s.close();
	}
	
	public static int check(int idNum, int ageNum) throws DataEntryException {
		final int MAX_ID = 999;
		final int MAX_AGE = 119;
		final int QUIT = 0;
		int ph = 1;
		
		if(idNum == QUIT && ageNum == QUIT) {
			ph = QUIT;
		}
		else {
			System.out.println("Valid ID and age");
		}
		if(idNum < QUIT || idNum > MAX_ID) {
			throw new DataEntryException(idNum);
		}
		if(ageNum < QUIT || ageNum > MAX_AGE) {
			throw new DataEntryException(ageNum);
		}
		
		return ph;
	}

}
