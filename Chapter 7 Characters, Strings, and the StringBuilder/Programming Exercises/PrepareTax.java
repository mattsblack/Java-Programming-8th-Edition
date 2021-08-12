import java.util.*;
public class PrepareTax {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in);
      int correctSocial = 0, correctZip = 0, correctStatus = 0, correctIncome = 0;
      String relationshipStatus = "", SSN = "", zipCode = "", firstName, lastName;
      int annualIncome = 0, i;
      System.out.println("Enter your name: ");
      String name = input.nextLine();
      while(correctSocial != 1 || correctZip != 5 || correctStatus != 1 || correctIncome != 1) {
         correctSocial = 0;
         correctZip = 0;
         correctStatus = 0;
         correctIncome = 0;
         System.out.println("Enter your social security number (format: 999-99-9999): ");
         SSN = input.nextLine();
         if(SSN.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")) {
            correctSocial = 1;
         }
         System.out.println("Input zip code (5 digits): ");
         zipCode = input.nextLine();
         if(zipCode.length() == 5) {
            for(i = 0; i < 5; i++) {
               if(Character.isDigit(zipCode.charAt(i))) {
                  correctZip += 1;
               }
            }
         }
         System.out.println("Input relationship status (Married or Single): ");
         relationshipStatus = input.nextLine();
         if(Character.toUpperCase(relationshipStatus.charAt(0)) == 'M' || Character.toUpperCase(relationshipStatus.charAt(0)) == 'S') {
            correctStatus = 1;
         }
         System.out.println("Enter your annual income: ");
         annualIncome = input.nextInt();
         if(annualIncome >= 0) {
            correctIncome = 1;
         }
      }
         TaxReturn tax = new TaxReturn(SSN, name, Integer.parseInt(zipCode), annualIncome, relationshipStatus);
         tax.displayData();
   }
}