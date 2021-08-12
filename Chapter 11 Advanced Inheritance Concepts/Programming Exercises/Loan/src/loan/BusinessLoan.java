package loan;

public class BusinessLoan extends Loan {

	public BusinessLoan(int num, String lname, int a, int t) {
		super(num, lname, a, t);
		interestRate *= 1.01;
	}

}
