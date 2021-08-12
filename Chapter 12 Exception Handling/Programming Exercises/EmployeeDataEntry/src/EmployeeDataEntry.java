import java.util.*;

public class EmployeeDataEntry {

	public static void main(String[] args) throws EmployeeException {
		Scanner s = new Scanner(System.in);
		int employeeNum = 0;
		double payRate = 0;
		int error = 0;
		try {
			error = 1;
			System.out.println("Enter employee number: ");
			employeeNum = s.nextInt();
			error = 4;
			System.out.println("Enter hourly pay rate: ");
			payRate = s.nextDouble();
			error = 0;
			check(employeeNum, payRate);
		}
		catch(InputMismatchException e) {
				System.out.println(EmployeeMessages.MESSAGES[error]);
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
		s.close();
	}
	
	
	public static void check(int num, double rate) throws EmployeeException {
		final int MIN_NUM = 1000;
		final int MAX_NUM = 9999;
		final double MIN_RATE = 9;
		final double MAX_RATE = 25;
		
		if(num < MIN_NUM) {
			throw new EmployeeException(EmployeeMessages.MESSAGES[2]);
		}
		if(num > MAX_NUM) {
			throw new EmployeeException(EmployeeMessages.MESSAGES[3]);
		}
		if(rate < MIN_RATE) {
			throw new EmployeeException(EmployeeMessages.MESSAGES[5]);
		}
		if(rate > MAX_RATE) {
			throw new EmployeeException(EmployeeMessages.MESSAGES[6]);
		}
	}

}
