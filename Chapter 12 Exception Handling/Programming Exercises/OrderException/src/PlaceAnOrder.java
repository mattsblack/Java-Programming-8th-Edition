import java.util.*;
public class PlaceAnOrder {

	public static void main(String[] args) {
		final int MAX_ITEM = 9999;
		final int MAX_QUANTITY = 12;
		final int[] ITEM = {111, 222, 333, 444};
		final double[] PRICE = {0.89, 1.47, 2.43, 5.99};
		
		int item;
		boolean found;
		int quantity;
		int error;
		double price = 0;
		double total = 0;
		Scanner s = new Scanner(System.in);
		
		try {
			error = 0;
			System.out.println("Enter item number: ");
			item = s.nextInt();
			error = 3;
			System.out.println("Enter quantity: ");
			quantity = s.nextInt();
			if(item < 0) {
				throw new OrderException(OrderMessages.MESSAGES[1]);
			}
			if(item > MAX_ITEM) {
				throw new OrderException(OrderMessages.MESSAGES[2]);
			}
			if(quantity < 1) {
				throw new OrderException(OrderMessages.MESSAGES[4]);
			}
			if(quantity > MAX_QUANTITY) {
				throw new OrderException(OrderMessages.MESSAGES[5]);
			}
			found = false;
			for(int i = 0; i < ITEM.length; i++) {
				if(item == ITEM[i]) {
					found = true;
					total = PRICE[i] * quantity;
					total *= 100;
					int temp = (int)total;
					total = temp / 100.0;
					price = PRICE[i];
					i = ITEM.length;
				}
				if(found) {
					System.out.println("Order is valid. Total is $" + total + "\n (" 
					+ quantity + " at $" + price + " each)");
				}
				else {
					throw new OrderException(OrderMessages.MESSAGES[6]);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	s.close();
	}
}
