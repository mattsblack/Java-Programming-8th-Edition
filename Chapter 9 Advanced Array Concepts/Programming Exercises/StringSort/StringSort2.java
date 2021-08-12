import java.util.Scanner;
import java.util.Arrays;
public class StringSort2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] strarray = new String[20];
      int i, len = strarray.length;
      for(i = 0; i < len; i++) {
         System.out.println("Enter a string: ");
         strarray[i] = sc.nextLine();
      }
      Arrays.sort(strarray);
      for(i = 0; i < len; i++) {
         System.out.println(strarray[i]);
      }
   }
}