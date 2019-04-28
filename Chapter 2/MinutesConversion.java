import java.util.Scanner;
public class MinutesConversion {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int minutes, hours;
      double days;
      System.out.println("Enter number of minutes: ");
      minutes = input.nextInt();
      hours = minutes/60;
      days = (double)minutes/1440;
      System.out.println("Minutes to hours: " + hours);
      System.out.println("Minutes to days: " + days);
   }
}