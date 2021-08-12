import java.util.Scanner;
public class TestFitnessTracker2 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter activity: ");
      String actv = s.nextLine();
      System.out.println("Enter date in 'Month day, year' form:");
      String dat = s.nextLine();
      System.out.println("Enter time spent in minutes: ");
      int min = s.nextInt();
      FitnessTracker2.setData(actv, min, dat);
      System.out.println("Activity: " + FitnessTracker2.getActivity());
      System.out.println("Minutes spent doing the activity: " + FitnessTracker2.getMinutes());
      System.out.println("Date: " + FitnessTracker2.getDate());
   }
}