package student;

public class GraduateStudent extends Student {
	public static final int GRAD_TUITION = 6000;

	public GraduateStudent(int id, String lname) {
		super(id, lname);
	}

	@Override
	public void setTuition() {
		annualTuition = GRAD_TUITION;
	}

}
