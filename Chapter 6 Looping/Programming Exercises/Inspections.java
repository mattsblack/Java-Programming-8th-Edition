import java.lang.Math;
public class Inspections {
   public static void main(String args[]) {
      int factoryNum;
      int factoryoneCount = 0, factorytwoCount = 0, factorythreeCount = 0, factoryfourCount = 0;
      for(int i=0; i<52; ++i){
         factoryNum = 1 + (int) (Math.random() * 4);
         System.out.print("Week " + (i+1) + ": ");
         System.out.println("Factory #" + factoryNum);
         switch(factoryNum) {
         case 1:
            factoryoneCount++;
            break;
         case 2:
            factorytwoCount++;
            break;
         case 3:
            factorythreeCount++;
            break;
         case 4: 
            factoryfourCount++;
            break;
         }
      }
      System.out.println("Percentage of inspections at each factory:");
      System.out.println("Factory 1: " + (Math.round(100*((float)factoryoneCount/52))) + "%");
      System.out.println("Factory 2: " + (Math.round(100*((float)factorytwoCount/52))) + "%");
      System.out.println("Factory 3: " + (Math.round(100*((float)factorythreeCount/52))) + "%");
      System.out.println("Factory 4: " + (Math.round(100*((float)factoryfourCount/52))) + "%");
   }
}