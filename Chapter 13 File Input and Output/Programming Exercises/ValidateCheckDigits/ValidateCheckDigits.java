package ValidateCheckDigits;

import java.io.*;
import java.nio.file.*;

public class ValidateCheckDigits {
    public static void main(String[] args) {
        Path filePath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\ValidateCheckDigits\\file.txt");
        Path outputPath = Paths.get("enter path here\\IdeaProjects\\Java-Programming-8th-Edition\\Chapter 13 File Input and Output\\Programming Exercises\\ValidateCheckDigits\\validnumbers.txt");
        try {
            InputStream in = new BufferedInputStream(Files.newInputStream(filePath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(outputPath));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            String line;
            while ((line = reader.readLine()) != null) {
                int s = Integer.parseInt(line);
                if (checkValid(s)) {
                        writer.write(s + " is valid.");
                    }
                }
            reader.close();
            writer.close();
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static boolean checkValid(int s) {
        int last = s % 10;
        int sum = 0;
        int temp = s;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return (sum / 10 == last);
    }
}