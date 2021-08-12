import java.util.Scanner;
import java.lang.Character;
public class ConstructID {
   public static void main(String args[]) {
      StringBuilder name = new StringBuilder();
      StringBuilder address = new StringBuilder();
      StringBuilder ID = new StringBuilder();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your full name: ");
      name.append(input.nextLine());
      System.out.println("Enter your street address: ");
      address.append(input.nextLine());
      /*TODO: iterate through name and append the first letter of each word to the ID
      then iterate through the address and append only the numbers of the address to the ID*/
      ID.append(name.charAt(0));
      for(int i = 0; i < name.length(); i++) {
         if(name.charAt(i) == ' ') {
            ID.append(name.charAt(i+1));
         }
      }
      for(int j = 0; j < address.length(); j++) {
         if(Character.isDigit(address.charAt(j)) == true) {
             ID.append(address.charAt(j));
         }
      }
      System.out.println(ID.toString().toUpperCase());
   }
}