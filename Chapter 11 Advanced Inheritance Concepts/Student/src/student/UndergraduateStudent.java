package student;

public class UndergraduateStudent extends Student {
	public static final int UNDERGRAD_TUITION = 4000;
	
	public UndergraduateStudent(int id, String lname) {
		super(id, lname);
	}

	@Override
	public void setTuition() {
		annualTuition = UNDERGRAD_TUITION;
	}

}
