package SeekPosition;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class SeekPosition2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname;
        int position, numChars;

        System.out.print("Enter the file name: ");
        fname = sc.nextLine();

        System.out.print("Enter the position in the file: ");
        position = sc.nextInt();

        System.out.print("Enter the number of characters to read: ");
        numChars = sc.nextInt();

        try {
            RandomAccessFile raf = new RandomAccessFile(fname + ".txt", "rw");
            raf.seek(position);

            // read next 20 characters from the file
            for (int i = 0; i < numChars; i++) {
                System.out.print((char)raf.read());
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Error: IO Exception.");
        }
        sc.close();
    }
}