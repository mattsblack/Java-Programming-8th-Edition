package StudentsStanding;

import java.io.*;
public class StudentsStanding2 {
    public static void main(String[] args) throws IOException {
        displayGoodStanding();
        displayAcademicProbation();
    }

    private static void displayGoodStanding() throws IOException {
        String s;
        String delimiter = ",";
        String[] array;
        System.out.println("Good Standing Students");
        System.out.println("ID\tFirst Name\tLast Name\tGPA");
        try {
            InputStream in = new BufferedInputStream(new FileInputStream("goodStanding.txt"));
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void displayAcademicProbation() throws IOException {
        String s;
        String delimiter = ",";
        String[] array;
        System.out.println("Academic Probation Students");
        System.out.println("ID\tFirst Name\tLast Name\tGPA");
        try {
            InputStream in = new BufferedInputStream(new FileInputStream("academicProbation.txt"));
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}