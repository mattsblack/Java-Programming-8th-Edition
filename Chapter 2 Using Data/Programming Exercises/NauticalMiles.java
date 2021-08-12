public class NauticalMiles {
   public static void main(String[] args) {
      final double nautKM = 1.852;
      final double nautMI = 1.150779;
      int naut = 20;
      System.out.println("Number of miles in a given number of nautical miles: " + naut*nautMI);
      System.out.println("Number of kilometers in a given number of nautical miles: " + naut*nautKM);
   }
}