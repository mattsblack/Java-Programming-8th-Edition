public class Billing {
   public static void computeBill(double price) {
      double total = price + (0.08*price);
      System.out.println("The total price for the bill is: $" + total);
   }
   public static void computeBill(double price, int quantity) {
      double total1 = (price * quantity)  + (0.08 * (price * quantity));
      System.out.println("The total price for the bill is: $" + total1);
   }
   public static void computeBill(double price, int quantity, int coupon) {
      double total2 = ((price * quantity) - coupon) + (0.08 * ((price * quantity) - coupon));
      System.out.println("The total price for the bill is: $" + total2);
   }
   public static void main(String[] args) {
      computeBill(23.2);
      computeBill(24.4, 2);
      computeBill(25.3, 3, 5);
   }
}