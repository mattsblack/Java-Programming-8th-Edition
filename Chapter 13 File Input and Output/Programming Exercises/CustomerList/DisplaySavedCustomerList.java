package CustomerList;

import java.nio.file.*;
import java.io.*;

public class DisplaySavedCustomerList {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Matt\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\CustomerList\\CustomerList.txt");
        String s;
        String delimiter = ",";
        String[] array;
        try {
            InputStream in = new BufferedInputStream(Files.newInputStream(filePath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            s = reader.readLine();
            while(s != null) {
                array = s.split(delimiter);
                for (String value : array) {
                    System.out.println(value + " ");
                }
                System.out.println();
                s = reader.readLine();
            }
            reader.close();
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}