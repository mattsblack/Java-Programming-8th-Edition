import java.util.Scanner;
public class UseInsurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Life l = new Life();
		Health h = new Health();
		
		System.out.print("Enter the type of insurance to display (life or health) : ");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("life")) {
			l.display();
		}
		if(choice.equalsIgnoreCase("health")) {
			h.display();
		}
		sc.close();
	}

}
