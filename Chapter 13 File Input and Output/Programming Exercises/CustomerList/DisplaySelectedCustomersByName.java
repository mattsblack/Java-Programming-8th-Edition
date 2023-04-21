package CustomerList;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class DisplaySelectedCustomersByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path filePath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\CustomerList\\CustomerList.txt");
        String s;
        String delimiter = ",";
        String[] array;
        String search;
        boolean found = false;
        try {
            InputStream in = new BufferedInputStream(Files.newInputStream(filePath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            System.out.println(); // spacing
            System.out.print("Enter the customer last name to search for: ");
            search = sc.nextLine();
            s = reader.readLine();
            while(s != null) {
                array = s.split(delimiter);
                if (array[2].equals(search)) {
                    System.out.println("Customer last name " + search + " was found.");
                    System.out.println("Customer number: " + array[0]);
                    System.out.println("Last name: " + array[2]);
                    System.out.println("Balance: " + array[3]);
                    found = true;
                }
                s = reader.readLine();
            }
            if (!found) {
                System.out.println("Customer last name " + search + " was not found.");
            }
            reader.close();
            sc.close();
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}