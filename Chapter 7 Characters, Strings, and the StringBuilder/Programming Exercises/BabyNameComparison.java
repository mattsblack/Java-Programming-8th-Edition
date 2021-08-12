import java.util.Scanner;
public class BabyNameComparison {
   public static void main(String args[]) {
      String nameOne;
      String nameTwo;
      String nameThree;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a name");
        nameOne = s.nextLine();
      System.out.println("Enter a name");
        nameTwo = s.nextLine();
      System.out.println("Enter a name");
        nameThree = s.nextLine();
      System.out.println(nameOne + " " + nameTwo);
      System.out.println(nameOne + " " + nameThree);
      System.out.println(nameTwo + " " + nameOne);
      System.out.println(nameTwo + " " + nameThree);
      System.out.println(nameThree + " " + nameOne);
      System.out.println(nameThree + " " + nameTwo);
      s.close();
   }
}