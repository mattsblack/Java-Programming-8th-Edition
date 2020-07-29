public class Purchase {
   private static int invoiceNum;
   private static int saleAmount;
   float salesTax;
   public static void setsaleAmount(int amount) {
      saleAmount = amount + (int)(0.05*amount);
   }
   
   public static void setinvoiceNum(int invoice) {
      invoiceNum = invoice;
   }
   
   public int getsaleAmount() {
      return saleAmount;
   }
   
   public int getinvoiceNum() {
      return invoiceNum;
   }
   
   public static void displayDetails(int invoice, int amount) {
      System.out.println("Invoice number: " + invoiceNum);
      System.out.println("Sale Amount: " + saleAmount);
      System.out.println("Sales Tax: 5%");
   }
}