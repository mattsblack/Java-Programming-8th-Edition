import java.util.Scanner;
public class MadLib {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String noun1, noun2, adjective1, adjective2;
      System.out.println("Enter a noun: ");
      noun1 = input.nextLine();
      System.out.println("Enter another noun: ");
      noun2 = input.nextLine();
      System.out.println("Enter an adjective: ");
      adjective1 = input.nextLine();
      System.out.println("Enter another adjective: ");
      adjective2 = input.nextLine();
      System.out.println("Mary had a little " + noun1 + "\n Its " + noun2 + " was as " + adjective1 + " as snow \n" + "And everywhere that Mary " + adjective2 + "\n The " + noun1 + " was sure to go.");
   }
}