public class BloodData {
   static String bloodType;
   static String rhFactor;
   public void defaultPatient() {
      bloodType = "O";
      rhFactor = "+";
   }
   public static void setBlood(String blood) {
       bloodType = blood;
    }
   public static void setRH(String rhF) {
      rhFactor = rhF;
    }
   public static String getBlood() {
      return bloodType;
   }
  public static String getRH() {
      return rhFactor;
   }
}