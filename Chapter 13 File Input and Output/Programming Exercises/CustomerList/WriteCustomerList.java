package CustomerList;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class WriteCustomerList {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Matt\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\CustomerList\\customerList.txt");
        Scanner input = new Scanner(System.in);
        String idString;
        int id;
        String s;
        String fname;
        String lname;
        String delimiter = ",";
        double balance;
        final String QUIT = "999";
        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(filePath));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            System.out.print("Enter customer ID number or " + QUIT + " to quit >> ");
            idString = input.nextLine();
            while (!idString.equals(QUIT)) {
                id = Integer.parseInt(idString);
                System.out.print("Enter first name >> ");
                fname = input.nextLine();
                System.out.print("Enter last name >> ");
                lname = input.nextLine();
                System.out.print("Enter balance >> ");
                balance = input.nextDouble();
                input.nextLine();
                s = id + delimiter + fname + delimiter + lname + delimiter + balance + System.getProperty("line.separator");
                writer.write(s, 0, s.length());
                System.out.print("Enter next customer ID number or " + QUIT + " to quit >> ");
                idString = input.nextLine();
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Error: IO Exception.");
        }
    }
}