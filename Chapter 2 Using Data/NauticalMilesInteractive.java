import java.util.Scanner;
public class NauticalMilesInteractive {
   public static void main(String[] args) {
      final double nautKM = 1.852;
      final double nautMI = 1.150779;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of nautical miles: ");
      int naut = input.nextInt();
      System.out.println("Number of miles in a given number of nautical miles: " + naut*nautMI);
      System.out.println("Number of kilometers in a given number of nautical miles: " + naut*nautKM);
   }
}