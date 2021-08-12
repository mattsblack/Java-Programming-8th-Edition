package certofdepositarray;
import java.time.LocalDate;
import java.util.Scanner;
public class CertOfDepositArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CertOfDeposit[] cert = new CertOfDeposit[5];
		for(int i = 0; i < cert.length; ++i) {
			cert[i] = new CertOfDeposit();
			System.out.println("Enter the certificate number: ");
			cert[i].setCertNum(scan.nextLine());
			System.out.println("Enter the last name:");
            cert[i].setLastName(scan.nextLine());
            System.out.println("Enter the balance");
            cert[i].setBalance(scan.nextDouble());
            scan.nextLine();
            System.out.println("Enter the issue date in a YYYY-MM-DD format");
            cert[i].setIssueDate(LocalDate.parse(scan.nextLine()));
		}
		displayData(cert);
		scan.close();
	}
	public static void displayData(CertOfDeposit[] cert) {
		for(int i = 0;i < cert.length;++i){
            System.out.println("The first certificate is: #"+cert[i].getCertNum()+"\n"+
                    "The Last name registered with it is: "+cert[i].getLastName()+"\n"+
                    "The balace of it is: $"+cert[i].getBal()+"\n"+
                    "The issue date was: "+cert[i].getIssueDate()+"\n"+
                    "And the maturity date is: "+cert[i].getMaturityDate());
        }
	}

}
