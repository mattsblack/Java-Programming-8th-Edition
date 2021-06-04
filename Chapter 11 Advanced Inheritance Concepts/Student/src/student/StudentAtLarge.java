package student;

public class StudentAtLarge extends Student {
	public static final int SAL_TUITION = 2000;
	
	public StudentAtLarge(int id, String lname) {
		super(id, lname);
	}

	@Override
	public void setTuition() {
		annualTuition = SAL_TUITION;
	}

}
