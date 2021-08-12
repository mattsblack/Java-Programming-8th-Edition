public class CountByThrees {
   public static void main(String[] args) {
      final int LIMIT = 300;
      for(int i=3; i<=300; i += 3) {
         if(i % 10 == 0 && i % 3 == 0) {
            System.out.println(i + " ");
         }
         else System.out.print(i + " ");
      }
   }
}