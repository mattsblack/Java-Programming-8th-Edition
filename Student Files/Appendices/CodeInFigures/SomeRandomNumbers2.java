import java.util.*;
public class SomeRandomNumbers2
{
   public static void main(String[] args)
   {
      Random ran = new Random();
      final int LIMIT = 10;
      System.out.print(ran.nextInt(LIMIT) + " ");
      System.out.print(ran.nextInt(LIMIT) + " ");
      System.out.println(ran.nextInt(LIMIT));
   }
}
