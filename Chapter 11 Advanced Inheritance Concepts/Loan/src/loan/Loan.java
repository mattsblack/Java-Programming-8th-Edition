package loan;
import java.util.Scanner;

public abstract class Loan implements LoanConstants {
	protected int number;
	protected String lastName;
	protected int amount;
	protected double interestRate;
	protected int term;
	Scanner sc = new Scanner(System.in);
	
	public Loan(int num, String lname, int a, int t) {
		number = num;
		lastName = lname;
		while(amount > MAXIMUM_LOAN_AMOUNT) {
			System.out.println("Enter a laon amount lower than " + MAXIMUM_LOAN_AMOUNT+":\n");
			amount = sc.nextInt();
		}
		amount = a;
		switch(term) {
		case 1:
		case 3:
		case 5:
			term = t;
			break;
		default:
			term = 1;
			break;
		}
	sc.close();
	}
	
	public int getLoanNumber() {
        return number;
    }

    public void setLoanNumber(int loanNumber) {
        number = loanNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String customerLastName) {
        lastName = customerLastName;
    }

    public int getLoanAmount() {
        return amount;
    }

    public void setLoanAmount(int amountOfLoan) {
        amount = amountOfLoan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
    
    @Override
    public String toString(){
        return "Loan number: "+number+"\n"
                +"Customer lastname: "+lastName+"\n"
                +"Amount of loan: "+amount+"\n"
                +"Interest rate: "+interestRate+"\n" 
                +"Term: "+term;
    }
}
