import java.util.Scanner;
public class ShowStudent2 {
   public static void main(String[] args) {
      Student student = new Student();
      student = getData(student);  
      System.out.println("Student ID: " + student.getStudentID());
      System.out.println("Credit Hours: " + student.getCreditHours());
      System.out.println("Points Earned: " + student.getPointsEarned());
      System.out.println("GPA: " + student.getGPA());
   }
   public static Student getData(Student s) {
      int StudentID = 9999;
      int CreditHours = 3;
      int PointsEarned= 12;
      s.setStudentID(StudentID);
      s.setCreditHours(CreditHours);
      s.setPointsEarned(PointsEarned);
      s.calcGPA(PointsEarned, CreditHours);
      return s;
   }
}