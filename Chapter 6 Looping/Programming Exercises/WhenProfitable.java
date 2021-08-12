public class WhenProfitable {
   public static void main(String[] args) {
      int expenses = 35000;
      int gross = 20000;
      int years = 0;
      int netProfit;
      int netLoss;
      for(int i = 1; i<=20; ++i) {
      System.out.println();
         years = years+1;
         System.out.println("Year: " + years);
         gross = gross + (int)(gross*.10);
         System.out.println("The gross profit is: $" + gross);
         expenses = expenses + (int)(expenses*.04);
         System.out.println("Expenses are: $" + expenses);
         netProfit = gross-expenses;
         if(netProfit > 0)
            System.out.println("Net profit is: $" + netProfit);
         netLoss = gross-expenses;
         if(netLoss < 0)
            System.out.println("Net loss is: $" + netLoss);
      }
   }
}