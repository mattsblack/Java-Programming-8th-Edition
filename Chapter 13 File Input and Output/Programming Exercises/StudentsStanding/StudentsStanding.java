package StudentsStanding;

import java.io.*;
import java.util.Scanner;
public class StudentsStanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String fname, lname;
        double gpa;
        String s;
        String delimiter = ",";
        final String QUIT = "999";
        try {
            OutputStream goodStanding = new BufferedOutputStream(new FileOutputStream("goodStanding.txt"));
            OutputStream academicProbation = new BufferedOutputStream(new FileOutputStream("academicProbation.txt"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(goodStanding));
            BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(academicProbation));

            System.out.print("Enter student ID number or " + QUIT + " to quit >> ");
            id = sc.nextInt();
            while (id != Integer.parseInt(QUIT)) {
                sc.nextLine();
                System.out.print("Enter first name >> ");
                fname = sc.nextLine();
                System.out.print("Enter last name >> ");
                lname = sc.nextLine();
                System.out.print("Enter GPA >> ");
                gpa = sc.nextDouble();
                new java.util.Scanner(System.in).nextLine();
                if (gpa >= 2.0) {
                    s = id + delimiter + fname + delimiter + lname + delimiter + gpa + System.getProperty("line.separator");
                    writer.write(s, 0, s.length());
                } else {
                    s = id + delimiter + fname + delimiter + lname + delimiter + gpa + System.getProperty("line.separator");
                    writer2.write(s, 0, s.length());
                }
                System.out.print("Enter next student ID number or " + QUIT + " to quit >> ");
                id = new java.util.Scanner(System.in).nextInt();
            }
            writer.close();
            writer2.close();
        } catch (java.io.IOException e) {
            System.out.println("Error: IO Exception.");
        }
    }
}