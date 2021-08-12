import java.util.Scanner;
public class Inbetween {
   public static void main(String[] args) {
      int i;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int a = s.nextInt();
      System.out.println("Enter another number: ");
      int b = s.nextInt();
      if(a>b) {
         for(i = b; i<=a; i++) {
            System.out.println(i + " ");
         }
      }
      else if(b>a) {
         for(i=a; i<=b;i++) {
            System.out.println(i + " ");
         }
      }
      else if(a==b) {
         System.out.println("Both values are equal.");
      }
      else {
         System.out.println("Error.");
      }
      System.out.println("\n");
   }
}