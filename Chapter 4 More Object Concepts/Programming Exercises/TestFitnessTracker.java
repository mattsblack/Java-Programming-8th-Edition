import java.util.Scanner;
public class TestFitnessTracker {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter activity: ");
      String actv = s.nextLine();
      System.out.println("Enter date in 'Month day, year' form:");
      String dat = s.nextLine();
      System.out.println("Enter time spent in minutes: ");
      int min = s.nextInt();
      FitnessTracker.setActivity(actv);
      FitnessTracker.setMinutes(min);
      FitnessTracker.setDate(dat);
      System.out.println("Activity: " + FitnessTracker.getActivity());
      System.out.println("Minutes spent doing the activity: " + FitnessTracker.getMinutes());
      System.out.println("Date: " + FitnessTracker.getDate());
   }
}