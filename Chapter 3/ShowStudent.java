import java.util.Scanner;
public class ShowStudent {
   public static void main(String[] args) {
      Student student = new Student();
      student = getData(student);  
      System.out.println("Student ID: " + student.getStudentID());
      System.out.println("Credit Hours: " + student.getCreditHours());
      System.out.println("Points Earned: " + student.getPointsEarned());
      System.out.println("GPA: " + student.getGPA());
   }
   public static Student getData(Student s) {
      int StudentID;
      int CreditHours;
      int PointsEarned;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter Student ID: ");
      StudentID = keyboard.nextInt();
      System.out.println("Enter Credit Hours: ");
      CreditHours = keyboard.nextInt();
      System.out.println("Enter Points Earned: ");
      PointsEarned = keyboard.nextInt();
      s.setStudentID(StudentID);
      s.setCreditHours(CreditHours);
      s.setPointsEarned(PointsEarned);
      s.calcGPA(PointsEarned, CreditHours);
      return s;
   }
}