import java.util.Arrays;
public class StringSort {
   public static void main(String[] args) {
      String[] strarray = new String[20];
      strarray[0] = "******";
      strarray[1] = "***";
      strarray[2] = "*";
      strarray[3] = "*****";
      strarray[4] = "**";
      strarray[5] = "***********";
      strarray[6] = "****";
      strarray[7] = "******";
      strarray[8] = "*******";
      strarray[9] = "**";
      strarray[10] = "******";
      strarray[11] = "***************";
      strarray[12] = "********";
      strarray[13] = "****";
      strarray[14] = "**";
      strarray[15] = "****";
      strarray[16] = "***";
      strarray[17] = "*";
      strarray[18] = "*******";
      strarray[19] = "*";
      Arrays.sort(strarray);
      for(int i = 0; i < strarray.length; i++) {
         System.out.println(strarray[i]);
      }
   }
}  