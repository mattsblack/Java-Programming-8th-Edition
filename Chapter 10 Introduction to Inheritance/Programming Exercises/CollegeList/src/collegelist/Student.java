package collegelist;

import javax.swing.JOptionPane;

public class Student extends Person {
	private String major;
	private int gpa;
	
	public void setFields() {
		super.setFields();
		this.major = JOptionPane.showInputDialog(null, "Enter major: ");
		this.gpa = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter GPA: "));
	}

}
