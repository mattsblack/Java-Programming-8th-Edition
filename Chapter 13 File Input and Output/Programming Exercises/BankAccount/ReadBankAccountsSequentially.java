package BankAccount;

import java.io.*;
import java.nio.file.*;
public class ReadBankAccountsSequentially {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Matt\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\BankAccount\\BankAccounts.txt");
        try {
            InputStream in = new BufferedInputStream(Files.newInputStream(filePath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String s = reader.readLine();
            while(s != null) {
                System.out.println(s);
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