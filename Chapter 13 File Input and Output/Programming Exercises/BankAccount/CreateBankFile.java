package BankAccount;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class CreateBankFile {
    public static void main(String[] args) {
        final int NUM_RECORDS = 10000;
        final String NAME_FORMAT = "        ";
        final String ACCOUNT_NUMBER_FORMAT = "0000";
        final String BALANCE_FORMAT = "00000.00";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String delimiter = ",";
        final String QUIT = "q";
        Scanner sc = new Scanner(System.in);
        Path filename = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\BankAccount\\BankAccounts.txt");

        String placeholderRecord = ACCOUNT_NUMBER_FORMAT + delimiter + NAME_FORMAT + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECORD_LENGTH = placeholderRecord.length();

        String accountStr;
        int accountNumber;
        String name;
        double balance;
        byte[] data;
        ByteBuffer buffer;
        FileChannel fc;

        createEmptyFile(filename, placeholderRecord, NUM_RECORDS);

        try {
            fc = (FileChannel)Files.newByteChannel(filename, CREATE, WRITE);
            System.out.print("Enter account number or " + QUIT + " to quit >> ");
            accountStr = sc.nextLine();
            while (!accountStr.equals(QUIT)) {
                accountNumber = Integer.parseInt(accountStr);
                System.out.print("Enter name for account #" + accountStr + " >> ");
                name = sc.nextLine();
                StringBuilder sb = new StringBuilder(name);
                sb.setLength(NAME_LENGTH);
                name = sb.toString();

                System.out.print("Enter balance for account #" + accountStr + " >> ");
                balance = sc.nextDouble();
                sc.nextLine();
                DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
                String s = accountStr + delimiter + name + delimiter + df.format(balance) + System.getProperty("line.separator");
                data = s.getBytes();
                buffer = ByteBuffer.wrap(data);
                fc.position((long) accountNumber * RECORD_LENGTH);
                fc.write(buffer);
                fc.position(fc.position() + buffer.remaining());
                System.out.print("Enter account number or " + QUIT + " to quit >> ");
                accountStr = sc.nextLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }

    public static void createEmptyFile(Path file, String placeholderRecord, int numRecords) {
        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            for (int i = 0; i < numRecords; i++) {
                writer.write(placeholderRecord, 0, placeholderRecord.length());
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}