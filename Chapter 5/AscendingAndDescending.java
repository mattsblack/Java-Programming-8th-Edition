import java.util.Scanner;
public class AscendingAndDescending {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1, num2, num3;
      System.out.println("Enter first number: ");
      num1 = input.nextInt();
      System.out.println("Enter second number: ");
      num2 = input.nextInt();
      System.out.println("Enter third number: ");
      num3 = input.nextInt();
      if(num1 < num2 && num2 < num3) {
         System.out.println(num1 + " " + num2 + " " + num3);
      }
      if(num1 > num2 && num2 > num3) {
         System.out.println(num3 + " " + num2 + " " + num1);
      }
      if ((num1 > num2) && (num2 < num3)){
         System.out.println(num2 + " " + num1 + " " + num3);
      }
      if ((num1 < num2) && (num2 > num3)){
         System.out.println(num1 + " " + num3 + " " + num2);
      }
   }
}