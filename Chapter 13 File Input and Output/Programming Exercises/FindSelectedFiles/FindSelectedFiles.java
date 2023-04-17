package FindSelectedFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindSelectedFiles {
    public static void main(String[] args) {
        Path file1 = Paths.get("(File 1 path)");
        Path file2 = Paths.get("(File 2 path)");
        Path file3 = Paths.get("(File 3 path)");
        Path file4 = Paths.get("(File 4 path)");

        try {
            if(Files.exists(file1)) {
                System.out.println("The file: " + file1.getFileName() + " exists.");

            } else if(Files.exists(file2)) {
                System.out.println("The file: " + file2.getFileName() + " exists.");

            } else if(Files.exists(file3)) {
                System.out.println("The file: " + file3.getFileName() + " exists.");

            } else if(Files.exists(file4)) {
                System.out.println("The file: " + file4.getFileName() + " exists.");

            } else {
                System.out.println("None of the files exist.");
            }
        } catch(Exception e) {
            System.out.println("Error: IO Exception.");
        }

    }
}