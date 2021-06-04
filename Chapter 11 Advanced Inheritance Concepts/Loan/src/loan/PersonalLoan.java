package loan;

public class PersonalLoan extends Loan {

	public PersonalLoan(int num, String lname, int a, int t) {
		super(num, lname, a, t);
		interestRate *= 2.01;
	}

}
