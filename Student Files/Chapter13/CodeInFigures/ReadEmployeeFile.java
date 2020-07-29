import java.nio.file.*;
import java.io.*;
public class ReadEmployeeFile
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\Employees.txt");
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         
         s = reader.readLine();
         while(s != null)
         {
            System.out.println(s);
            s = reader.readLine();           
         }
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
