package collegelist;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	private int ssn;
	private int salary;
	private String departmentName;
	
	public void setFields() {
		super.setFields();
		this.ssn = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Social Security number: "));
		this.salary = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the annual salary: "));
		this.departmentName = JOptionPane.showInputDialog(null, "Enter the department name: ");
	}
	
	public void display() {
		super.display();
		System.out.println("\nSocial Security number: " + ssn + "\nAnnual salary: " + salary
							+ "\nDepartment name: " + departmentName);
	}

}
