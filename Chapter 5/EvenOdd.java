import java.util.Scanner;
public class EvenOdd {
   public static void main(String[] args) {
      int num;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer");
      num = input.nextInt();
      if(num%2 == 0)
         System.out.println("Number is even");
      else
         System.out.println("Number is odd");
   }
}