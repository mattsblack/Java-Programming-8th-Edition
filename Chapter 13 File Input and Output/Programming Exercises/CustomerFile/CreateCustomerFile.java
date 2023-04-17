package CustomerFile;

import java.io.*;
import java.util.*;

public class CreateCustomerFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "customers.txt"; // File name to store customer data
        File file = new File(fileName);

        try {
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("Empty file created successfully: " + fileName);
            } else {
                System.out.println("File already exists. Appending data to existing file: " + fileName);
            }

            // Prompt user for input
            System.out.println("Enter customer data (ID, Last Name, Zip Code) or type 'quit' to finish:");
            while (true) {
                System.out.print("Enter customer ID (3 digits): ");
                String id = scanner.nextLine().trim();
                if (id.equalsIgnoreCase("quit")) {
                    break;
                }

                System.out.print("Enter customer Last Name (up to 6 characters): ");
                String lastName = scanner.nextLine().trim();
                if (lastName.length() > 6) {
                    lastName = lastName.substring(0, 6);
                } else if (lastName.length() < 6) {
                    lastName = String.format("%-6s", lastName);
                }

                System.out.print("Enter customer Zip Code (5 digits): ");
                String zipCode = scanner.nextLine().trim();

                // Check if the ID already exists
                if (checkDuplicateID(id, file)) {
                    System.out.println("Error: ID " + id + " already exists. Skipping record.");
                    continue;
                }

                // Append customer data to file
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.format("%s%s%s%n", id, lastName, zipCode));
                bufferedWriter.close();
            }

            System.out.println("Customer data saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error creating or writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Helper method to check for duplicate ID in the file
    private static boolean checkDuplicateID(String id, File file) throws IOException {
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.startsWith(id)) {
                fileScanner.close();
                return true;
            }
        }
        fileScanner.close();
        return false;
    }
}
