package collegelist;

import javax.swing.JOptionPane;

public class Person {
	private String firstName;
	private String lastName;
	private String streetAddress;
	private int zipCode;
	private int phoneNumber;
	
	public void setFields() {
		this.firstName = JOptionPane.showInputDialog(null,
                "Enter the first name");
        this.lastName = JOptionPane.showInputDialog(null,
                "Enter the last name");
        this.streetAddress = JOptionPane.showInputDialog(null,
                "Enter the street address");
        this.zipCode = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the zip code"));
        this.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the phone number"));
	}

	public void display() {
		System.out.println("First name: " + firstName + "\nLast name: " + lastName
							+ "\nStreet address: " + streetAddress + "\nZip code: " + zipCode
							+ "\nPhone number: " + phoneNumber);
	}

}
