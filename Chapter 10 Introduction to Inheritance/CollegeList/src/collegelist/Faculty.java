package collegelist;

import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee {
	private boolean isTenured;
	
	public void setFields() {
		super.setFields();
		this.isTenured = Boolean.valueOf(JOptionPane.showInputDialog(null, "Is this person tenured? "));
	}
	
	public void display()  {
		super.display();
		System.out.println("Is tenured: " + isTenured);
	}

}
