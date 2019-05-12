public class Student {
   int ID;
   int creditHours;
   int pointsEarned;
   double GPA;
   public Student() {
      ID = 0;
      creditHours = 0;
      pointsEarned = 0;
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
   
      