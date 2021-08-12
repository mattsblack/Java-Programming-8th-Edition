public class FormalLetterWriter {
      public static void displaySalutation(String lastName) {
         System.out.println("Dear Mr. or Ms. " + lastName);
      }
      public static void displaySalutation(String firstName, String lastName) {
         System.out.println("Dear " + firstName + " " + lastName + ",\nThank you for your recent order.");
      }
      public static void main(String[] args) {
         displaySalutation("Johnson");
         displaySalutation("John", "Smith");
      }
}