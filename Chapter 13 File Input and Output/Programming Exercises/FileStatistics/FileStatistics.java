package FileStatistics;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStatistics {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\Matt\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\FileStatistics\\file.txt");
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File name: " + path.getFileName());
            System.out.println("Parent folder: " + path.getParent().toString());
            System.out.println("File size: " + attr.size() + " bytes");
            System.out.println("Time of last modification: " + attr.lastModifiedTime());
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}