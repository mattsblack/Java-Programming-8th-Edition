public class Population {
   public static void main(String args[]) {
      int mexPop = 121000000;
      int usPop = 315000000;
      int years = 0;
      while(mexPop < usPop) {
         mexPop = mexPop + (int)(0.0101*mexPop);
         usPop = usPop - (int)(0.0015*mexPop);
         years++;
         System.out.println("Year " + years + ":");
         System.out.println("Mexico population: " + mexPop);
         System.out.println("US population: " + usPop);
      }
      System.out.println();
      System.out.println("It took Mexico " + years + " years to overtake the US in population.");
   }
}