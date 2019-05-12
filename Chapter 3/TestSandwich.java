import java.util.Scanner;
public class TestSandwich {
   public static void main(String[] args) {
      Sandwich sandwich = new Sandwich();
      sandwich = getData(sandwich);
      System.out.println("Main ingredient of sandwich: " + sandwich.getMainIngredient());
      System.out.println("Bread type of sandwich: " + sandwich.getBreadType());
      System.out.println("Price of sandwich: $" + sandwich.getPrice());
   }
   public static Sandwich getData(Sandwich s) {
      String ingredient;
      String bread;
      double pr;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the main ingredient: ");
      ingredient = keyboard.nextLine();
      System.out.println("Enter the bread type: ");
      bread = keyboard.nextLine();
      System.out.println("Enter the price: ");
      pr = keyboard.nextDouble();
      s.setMainIngredient(ingredient);
      s.setBreadType(bread);
      s.setPrice(pr);
      return s;
   }
}