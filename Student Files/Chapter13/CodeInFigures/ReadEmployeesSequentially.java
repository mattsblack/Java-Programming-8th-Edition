import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
public class ReadEmployeesSequentially
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\RandomEmployees.txt");
      String[] array = new String[3];
      String s = "";
      String delimiter = ",";
      int id;
      String stringId;
      String name;
      double payRate;
      double gross;
      final double HRS_IN_WEEK = 40;
      double total = 0;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         System.out.println();        
         s = reader.readLine();
         while(s != null)
         {
            array = s.split(delimiter);
            stringId = array[0];
            id = Integer.parseInt(array[0]);
            if(id != 0)
            {
               name = array[1];
               payRate = Double.parseDouble(array[2]);
               gross = payRate * HRS_IN_WEEK;
               System.out.println("ID#" + stringId + "  " + name + "   $" + payRate + "   $" + gross);
               total += gross;
            }
            s = reader.readLine();           
         }
         reader.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
      System.out.println("  Total gross payroll is $" + total);
   }
}
