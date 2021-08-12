public class DiagonalOs {
   public static void main(String[] args) {
      int i,j;
      for(i = 1; i<10; ++i) {
         for(j = 1; j<=i; ++j) {
            if(j==i) {
               System.out.print("O");
            }
            else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}