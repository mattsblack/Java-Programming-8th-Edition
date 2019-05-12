public class Lease {
   String tenantName;
   int apartmentNum;
   int rent;
   int term;
   public Lease() {
      tenantName = "XXX";
      apartmentNum = 0;
      rent = 1000;
      term = 12;
   }
   public void setTenantName(String Tenant) {
      tenantName = Tenant;
   }
   public void setApartmentNum(int aptnum) {
      apartmentNum = aptnum;
   }
   public void setRent(int rnt) {
      rent = rnt;
   }
   public void setTerm(int trm) {
      term = trm;
   }
   public String getTenantName() {
      return tenantName;
   }
   public int getApartmentNum() {
      return apartmentNum;
   }
   public int getRent() {
      return rent;
   }
   public int getTerm() {
      return term;
   }
   public int addPetFee(Lease a) {
      int petFee = rent + 10;
      return petFee;
   }
}