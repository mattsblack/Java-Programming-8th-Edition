import java.time.*;
public class CertOfDeposit {
   static int certNum;
   static String lastName;
   static int balance;
   LocalDate issueDate = LocalDate.of(2019, 2, 13);
   LocalDate maturityDate = issueDate.plusYears(1);
   public static void setCertNum(int cert) {
      certNum = cert;
   }
   public static void setLastName(String last) {
      lastName = last;
   }
   public static void setBalance(int bal) {
      balance = bal;
   }
   public static int getCertNum() {
      return certNum;
   }
   public static String getLastName() {
      return lastName;
   }
   public static int getBal() {
      return balance;
   }
   public CertOfDeposit(int cert, String last, int bal, LocalDate issueDate) {
      LocalDate maturityDate = issueDate.plusYears(1);
   }
}