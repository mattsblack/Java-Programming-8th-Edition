import java.util.Scanner;
import java.util.Arrays;
public class MeanMedian2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[20];
      int len = arr.length;
      for(int i = 0; i < len; i++) {
         System.out.println("Enter a number: ");
         arr[i] = sc.nextInt();
      }
      display(arr);
      getMean(arr);
      getMedian(arr);  
   }
   public static void display(int[] arr) {
      int len = arr.length;
      System.out.print("Values entered: ");
      for(int i = 0; i < len; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
   public static void getMean(int[] arr) {
      int sum = 0, mean, len = arr.length;
      for(int i = 0; i < len; i++) {
         sum += arr[i];
      }
      mean = sum/len;
      System.out.println("The mean is: " + mean);
   }
   public static void getMedian(int[] arr) {
      int median;
      Arrays.sort(arr);
      if (arr.length % 2 == 0) {
         median = (arr[arr.length/2] + arr[arr.length/2 - 1])/2;
      }
      else {
         median = arr[arr.length/2];
      }
      System.out.println("The median is: " + median);
   }
}