package phonecall;

import java.util.Scanner;

public class PhoneCallArray {

	public static void main(String[] args) {
		IncomingPhoneCall[] incomingCalls = new IncomingPhoneCall[10];
		OutgoingPhoneCall[] outgoingCalls = new OutgoingPhoneCall[10];
		Scanner sc = new Scanner(System.in);
		String input;
		int time;
		
		//set numbers for incoming calls
		for(int i = 0; i < incomingCalls.length; i++) {
			System.out.println("Enter phone number: ");
			input = sc.nextLine();
			incomingCalls[i] = new IncomingPhoneCall(input);
		}
		
		//set numbers for outgoing calls
		for(int i = 0; i < outgoingCalls.length; i++) {
			System.out.print("Enter phone number: ");
			input = sc.nextLine();
			System.out.println();
			sc.nextLine();
			System.out.print("Enter call length: ");
			time = sc.nextInt();
			outgoingCalls[i] = new OutgoingPhoneCall(input, time);
			sc.nextLine();
		}
		
		//display numbers for incoming calls
		for(int i = 0; i < incomingCalls.length; i++) {
			incomingCalls[i].getInfo();
		}
		
		//display numbers for outgoing calls
		for(int i = 0; i < outgoingCalls.length; i++) {
			outgoingCalls[i].getInfo();
		}
		sc.close();
	}

}
