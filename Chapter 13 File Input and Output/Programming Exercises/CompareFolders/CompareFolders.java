package CompareFolders;

import java.nio.file.*;

public class CompareFolders {
    public static void main(String[] args) {
        Path fileOnePath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\CompareFolders\\file1.txt");
        Path fileTwoPath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\CompareFolders\\file2.txt");
        Path fileThreePath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\CompareFolders\\file3.txt");
        try {
            if ((fileOnePath.getParent().equals(fileTwoPath.getParent()))
                    && (fileOnePath.getParent().equals(fileThreePath.getParent()))
                    && (fileTwoPath.getParent().equals(fileThreePath.getParent()))) {
                System.out.println("The files are in the same folder.");
            } else {
                System.out.println("The files are in different folders.");
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error " + e);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}