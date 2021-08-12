
public class GradeException extends Exception {
	
	public static String[] validGrades = {"A", "B","C","D","F","I"};
	
	public GradeException(String grade) {
		super(grade);
	}
}
