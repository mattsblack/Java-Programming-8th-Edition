import java.util.Scanner;
public class BookstoreCredit {
   public static void main(String[] args) {
      double gpa;
      String name;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your name: ");
      name =  s.nextLine();
      System.out.println("Enter your GPA: ");
      gpa = s.nextDouble();
      double credit = gpa*10.0;
      System.out.println("Student name: " + name + "\n GPA: " + gpa + "\n Credit recieved for GPA: $" + credit);
   }
}