import java.util.*;
public class SomeRandomNumbers3
{
   public static void main(String[] args)
   {
      Random ran = new Random(129867L);
      final int TIMES = 15;
      final int LIMIT = 7;
      for(int x = 0; x < TIMES; ++x)
         System.out.print(ran.nextInt(LIMIT) + " ");
      System.out.println();
   }
}
