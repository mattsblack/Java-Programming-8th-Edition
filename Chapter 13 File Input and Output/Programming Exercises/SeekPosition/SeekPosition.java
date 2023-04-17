package SeekPosition;

import java.util.Scanner;
import java.io.*;

public class SeekPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname;
        int position;

        System.out.print("Enter the file name: ");
        fname = sc.nextLine();

        System.out.print("Enter the position in the file: ");
        position = sc.nextInt();
        try {
            RandomAccessFile raf = new RandomAccessFile(fname + ".txt", "rw");
            raf.seek(position);

            // read next 20 characters from the file
            for (int i = 0; i < 20; i++) {
                System.out.print((char)raf.read());
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Error: IO Exception.");
        }
        sc.close();
    }
}