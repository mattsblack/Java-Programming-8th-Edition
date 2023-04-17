package FileSizeComparison;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSizeComparison {

    public static void main(String[] args) {
        Path file1 = Paths.get("(File 1 path)");
        Path file2 = Paths.get("(File 2 path)");
        long file1Size, file2Size;

        try {
            BasicFileAttributes file1Attributes = Files.readAttributes(file1, BasicFileAttributes.class);
            BasicFileAttributes file2Attributes = Files.readAttributes(file2, BasicFileAttributes.class);
            file1Size = file1Attributes.size();
            file2Size = file2Attributes.size();
            System.out.println("File 1 size: " + file1Size + " bytes");
            System.out.println("File 2 size: " + file2Size + " bytes");
            System.out.println("File size ratio: " + Math.round(((double)file1Size/file2Size)*100.0)/100.0 + ":" + Math.round(((double)file2Size/file1Size)*100.0)/100.0);


        } catch(IOException e) {
            System.out.println("Error: IO Exception.");
        }

    }

}
