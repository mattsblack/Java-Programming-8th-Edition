import java.util.Scanner;
public class TestLease {
   public static void main(String[] args) {
      Lease a = new Lease();
      Lease b = new Lease();
      Lease c = new Lease();
      Lease d = new Lease();
      a = getData(a);
      b = getData(b);
      c = getData(c);
      showValues(a);
      showValues(b);
      showValues(c);
   }
   public static Lease getData(Lease a) {
      String Tenant;
      int aptnum;
      int rnt;
      int trm;
      int petFee;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter tenant's name: ");
      Tenant = keyboard.nextLine();
      System.out.println("Enter apartment number: ");
      aptnum = keyboard.nextInt();
      System.out.println("Enter rent amount: ");
      rnt = keyboard.nextInt();
      System.out.println("Enter term length: ");
      trm = keyboard.nextInt();
      a.setTenantName(Tenant);
      a.setApartmentNum(aptnum);
      a.setRent(rnt);
      a.setTerm(trm);
      a.addPetFee(a);
      return a;
   }
   public static void showValues(Lease a) {
      System.out.println("Tenant's name: " + a.getTenantName());
      System.out.println("Apartment Number: " + a.getApartmentNum());
      System.out.println("Rent Amount: " + a.getRent());
      System.out.println("Term Length: " + a.getTerm());
   }
}