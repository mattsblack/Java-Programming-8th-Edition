public class TaxReturn {
      private String SSN;
      private String lastName;
      private String firstName;
      private String streetAddress;
      private String city;
      private String state;
      private int zipCode;
      private int annualIncome;
      private final String relationshipStatus;
      private double taxLiability;
      public TaxReturn(String SSN, String lastName, String firstName, String streetAddress, String city, String state, int zipCode, int annualIncome, String relationshipStatus) {
         this.SSN = SSN;
         this.lastName = lastName;
         this.firstName = firstName;
         this.streetAddress = streetAddress;
         this.zipCode = zipCode;
         this.annualIncome = annualIncome;
         this.relationshipStatus = relationshipStatus.toUpperCase();
         this.setTaxLiability();
     }
     public TaxReturn(String SSN, String firstName, int zipCode, int annualIncome, String relationshipStatus) {
         this.SSN = SSN;
         this.firstName = firstName;
         this.zipCode = zipCode;
         this.annualIncome = annualIncome;
         this.relationshipStatus = relationshipStatus;
         this.setTaxLiability();
     }
     private void setTaxLiability() {
         if(annualIncome >= 0 && annualIncome <= 20000) {
            switch(relationshipStatus) {
               case "MARRIED":
                  this.taxLiability = annualIncome * 0.14;
                  break;
               case "SINGLE":
                  this.taxLiability = annualIncome * 0.15;
                  break;
            }
         }
         else if(annualIncome > 20000 && annualIncome <= 50000) {
            switch(relationshipStatus) {
               case "MARRIED":
                  this.taxLiability = annualIncome * 0.22;
                  break;
               case "SINGLE":
                  this.taxLiability = annualIncome * 0.20;
                  break;
            }
        }
        else {
            switch(relationshipStatus) {
               case "MARRIED":
                  this.taxLiability = annualIncome * 0.30;
                  break;
               case "SINGLE":
                  this.taxLiability = annualIncome * 0.28;
            }
        }
    }
    public void displayData() {
      System.out.println("Hello " + firstName + " your tax return data is: \n" + "Annual income: $" + annualIncome + "\n" + "Tax Liability of: " + taxLiability);
    }
}