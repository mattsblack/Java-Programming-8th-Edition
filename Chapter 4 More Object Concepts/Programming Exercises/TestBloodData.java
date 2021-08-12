import java.util.Scanner;
public class TestBloodData {
   public static void main(String[] args) {
      String blood;
      String rhF;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Blood Type: ");
      blood = s.nextLine();
      System.out.println("Enter Rh Factor: ");
      rhF = s.nextLine();
      BloodData.setBlood(blood);
      BloodData.setRH(rhF);
      System.out.println("Your blood type is: " + BloodData.getBlood());
      System.out.println("Your Rh Factor is: " + BloodData.getRH());
   }
}