public class DivideEvenly2 {
   public static void main(String[] args) {
      final int LIMIT = 100;
      int number;
      int var;
      System.out.println(LIMIT + " is evenly divisible by: ");
      for(number = 1; number <= LIMIT; ++number) {
         System.out.println(number + " is evenly divisible by ");
         for(var = 1; var <= number; ++var)
            if(number % var == 0)
               System.out.println(var + " ");
         System.out.println();
      }
   }
}
