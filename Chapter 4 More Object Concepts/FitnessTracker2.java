public class FitnessTracker2 {
   static String activity;
   static int minutes;
   static String date;
   public void Actvity() {
      setData(activity, minutes, date);
   }
   public static void setData(String actv, int min, String dat) {
      activity = actv;
      minutes = min;
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