import java.text.*;
public class DecimalFormatTest
{
   public static void main(String[] args)
   {
      String pattern = "###,###.00";
      DecimalFormat moneyFormat = new DecimalFormat(pattern);
      double[] list = {1.1, 23.23, 456.249, 7890.1, 987.5678, 65.0};
      int x;
      for(x = 0; x < list.length; ++x)
         System.out.printf("%10s\n", moneyFormat.format(list[x]));
   }
}
