import java.util.Scanner;

public class TestApartment

{


public static void main(String[] args)
{
    int bedrooms;
    double bathrooms;
    int rent;

    // This prints out my name
    System.out.println("Beth Salvatore");

    // Uses Scanner class to accept keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Prompt user for input for minimum number of bedrooms required    
    System.out.print("Enter the minimum number of bedrooms: ");
    bedrooms = keyboard.nextInt();
    // Prompt user for input for minimum number of bathroomsrooms required
    System.out.print("Enter the minimum number of bathrooms: ");
    bathrooms = keyboard.nextDouble();
    // Prompt user for input for maximum amount of rent
    System.out.print("Enter the maximum amount of rent: ");
    rent = keyboard.nextInt();

    // This creates five different 
    // Apartment objects
    Apartment apt1 = new Apartment(101, 2, 1, 725);
    Apartment apt2 = new Apartment(102, 2, 1.5, 775);
    Apartment apt3 = new Apartment(103, 3, 2, 870);
    Apartment apt4 = new Apartment(104, 3, 2.5, 960);
    Apartment apt5 = new Apartment(105, 3, 3, 1100);

    String isMatchedMsg = "Below are the apartments that match your search criteria: ";
    String notMatchedMsg = "No matches were found.";

    if(isMatched(apt1))
     display(apt1, isMatchedMsg);
    else
     display(apt1, notMatchedMsg);

    if(isMatched(apt2))
     display(apt2, isMatchedMsg);
    else
     display(apt2, notMatchedMsg);

    if(isMatched(apt3))
     display(apt3, isMatchedMsg);
    else
     display(apt3, notMatchedMsg);

    if(isMatched(apt4))
     display(apt4, isMatchedMsg);
    else
     display(apt4, notMatchedMsg);

    if(isMatched(apt5))
     display(apt5, isMatchedMsg);
    else
     display(apt5, notMatchedMsg);
}   

     public static boolean isMatched(Apartment apt, int bedrooms, double bathrooms, int rent)
   {

  int count = 0;
  int MIN_MATCH = 3;
  boolean isMatch;

if (apt.numBedrooms >= bedrooms)
    count = count + 1;  
    if (apt.numBathrooms >= bathrooms)
        count = count + 1;
    if (apt.AptRent <= rent)
        count = count + 1;
    if(count >= MIN_MATCH)
        isMatch = true;
else
    isMatch = false;

  return isMatch;
   }
   public static void display(Apartment apt, String msg)
   {
    System.out.println("Here are your results your results: " +
    "\nApartment number: " + apt.getAptNumber() + "." +
    "\nNumber of bedrooms: " + apt.getnumBedrooms() + "." +
    "\nNumber of bathrooms: " + apt.getnumBathrooms() + "." + 
    "\nRent: " + apt.getAptRent() + ".\n");
}           
}