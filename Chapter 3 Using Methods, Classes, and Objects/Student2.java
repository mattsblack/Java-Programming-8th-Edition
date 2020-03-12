public class Student2 {
   int ID;
   int creditHours;
   int pointsEarned;
   double GPA;
   public void Student() {
      ID = 9999;
      creditHours = 3;
      pointsEarned = 12;
      GPA = 0;
   }
  public void setStudentID(int StudentID) {
       ID = StudentID;
   }
   public void setCreditHours(int CreditHours) {
      creditHours = CreditHours;
   }
   public void setPointsEarned(int PointsEarned) {
      pointsEarned = PointsEarned;
   }
   public void calcGPA(int PointsEarned, int CreditHours) {
      GPA = PointsEarned / CreditHours;
   }
   public double getGPA() {
      return GPA;
   }
   public int getStudentID() {
      return ID;
   }
   public int getCreditHours() {
      return creditHours;
   }
   public int getPointsEarned() {
      return pointsEarned;
   }
}
   
      