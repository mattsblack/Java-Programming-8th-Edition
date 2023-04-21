package BankAccount;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class ReadBankAccountsRandomly {
    public static void main(String[] args) {
        Path filePath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\BankAccount\\BankAccounts.txt");
        Scanner sc = new Scanner(System.in);
        int accNum;
        boolean finished = false;
        String s;
        try {
            RandomAccessFile file = new RandomAccessFile(filePath.toFile(),"r");
            while (!finished) {
                System.out.print("Enter account number or -1 to quit >> ");
                accNum = sc.nextInt();
                if (accNum == -1) {
                    finished = true;
                } else {
                    file.seek((accNum - 1) * 8L); //move file pointer to the beginning of the record. Each record is 8 bytes long.
                    s = file.readLine();
                    System.out.println(s);
                }
            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        }
    }
}