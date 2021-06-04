package participant;

import java.util.*;

public class TwoEventParticipants {
	public static void main(String[] args) {
		String name, address;
		int age;
		Scanner s = new Scanner(System.in);
		Participant[] marathon = new Participant[8];
		Participant[] diving = new Participant[8];
		ArrayList<Participant> both = new ArrayList<Participant>();
		
		System.out.println("Enter values for marathon array: ");
		for(int i = 0; i < marathon.length; i++) {
			System.out.println("Enter name: ");
			name = s.nextLine();
			System.out.println("Enter age: ");
			age = s.nextInt();
			System.out.println("Enter address: ");
			address = s.nextLine();
			marathon[i] = new Participant(name, age, address);
			s.nextLine();
		}
		
		System.out.println("Enter values for diving array: ");
		for(int i = 0; i < diving.length; i++) {
			System.out.println("Enter name: ");
			name = s.nextLine();
			System.out.println("Enter age: ");
			age = s.nextInt();
			System.out.println("Enter address: ");
			address = s.nextLine();
			diving[i] = new Participant(name, age, address);
		}
		
		//compare both arrays and print values
		for(int i = 0; i < both.size(); i++) {
			if(marathon[i].equals(diving[i])) {
				both.add(marathon[i]);
			}
		}
		
		for(int j = 0; j < both.size(); j++) {
			System.out.println(both.get(j).toString());
		}
		s.close();
	}
}
