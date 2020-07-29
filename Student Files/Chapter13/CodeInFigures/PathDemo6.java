import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class PathDemo6
{
   public static void main(String[] args)
   {
      Path file1 =
         Paths.get("C:\\Java\\Chapter.13\\Data.txt");
      Path file2 =
         Paths.get("C:\\Java\\Chapter.13\\Data2.txt");
      try
      {
         BasicFileAttributes attr1 =
            Files.readAttributes(file1, BasicFileAttributes.class);
         BasicFileAttributes attr2 =
            Files.readAttributes(file2, BasicFileAttributes.class);
         FileTime time1 = attr1.creationTime();
         FileTime time2 = attr2.creationTime();
         System.out.println("file1's creation time is: " + time1);
         System.out.println("file2's creation time is: " + time2);
         if(time1.compareTo(time2) < 0)
            System.out.println("file1 was created before file2");
         else
            if(time1.compareTo(time2) > 0)
                System.out.println("file1 was created after file2");
            else
                System.out.println("file1 and file2 were created at the same time");
      }
      catch(IOException e)
      {
          System.out.println("IO Exception");
      }
   }
}
