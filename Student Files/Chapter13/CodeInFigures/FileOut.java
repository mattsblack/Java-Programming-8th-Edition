import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut
{ 
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\Grades.txt");
      String s = "ABCDF";
      byte[] data = s.getBytes();
      OutputStream output = null;   
      try
      {
        output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
        output.write(data);
        output.flush();
        output.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
