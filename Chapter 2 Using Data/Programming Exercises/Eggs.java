public class Eggs {
   public static void main(String[] args) {
      final double dozenegg = 3.25;
      final double singleegg = .45;
      int eggs = 234;
      int dozen = eggs/12;
      int single = eggs%12;
      double total = (dozen*3.25) + (single + .45);
      System.out.println("You ordered " + eggs + " eggs. " + "That's " + dozen + " dozen at $3.25 per dozen and " + single + " loose eggs for a total of $" + total + "." );
   }
}