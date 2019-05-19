public class FitnessTracker {
   static String activity;
   static int minutes;
   static String date;
   public void Actvity() {
      activity = "running";
      minutes = 0;
      date = "January 1, 2019";
   }
   public static void setActivity(String actv) {
      activity = actv;
   }
   public static void setMinutes(int min) {
      minutes = min;
   }
   public static void setDate(String dat) {
      date = dat;
   }
   public static String getActivity() {
      return activity;
   }
   public static int getMinutes() {
      return minutes;
   }
   public static String getDate() {
      return date;
   }
}