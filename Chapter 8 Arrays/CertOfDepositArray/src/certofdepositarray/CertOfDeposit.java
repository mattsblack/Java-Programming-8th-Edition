package certofdepositarray;
import java.time.*;
public class CertOfDeposit {
   static String certNum;
   static String lastName;
   static double balance;
   LocalDate issueDate = LocalDate.of(2019, 2, 13);
   LocalDate maturityDate = issueDate.plusYears(1);
   public void setCertNum(String cert) {
      certNum = cert;
   }
   public void setLastName(String last) {
      lastName = last;
   }
   public void setBalance(double bal) {
      balance = bal;
   }
   public void setIssueDate(LocalDate date)
   {
      issueDate = date;
      maturityDate = issueDate.plusYears(1);
   }
   public String getCertNum() {
      return certNum;
   }
   public String getLastName() {
      return lastName;
   }
   public double getBal() {
      return balance;
   }
   public LocalDate getMaturityDate() {
	   return maturityDate;
   }
   public LocalDate getIssueDate()
   {
      return issueDate;
   }
   public CertOfDeposit(int cert, String last, int bal, LocalDate issueDate) {
      LocalDate maturityDate = issueDate.plusYears(1);
   }
   public CertOfDeposit() {
   }
}