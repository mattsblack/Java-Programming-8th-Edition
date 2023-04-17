package CustomerFile;

import java.io.*;
import java.util.*;

public class CreateItemFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "items.txt"; // File name to store item data
        File file = new File(fileName);

        try {
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("Empty file created successfully: " + fileName);
            } else {
                System.out.println("File already exists. Appending data to existing file: " + fileName);
            }

            // Prompt user for input
            System.out.println("Enter item data (Item Number, Description) or type 'quit' to finish:");
            while (true) {
                System.out.print("Enter item number (3 digits): ");
                String itemNumber = scanner.nextLine().trim();
                if (itemNumber.equalsIgnoreCase("quit")) {
                    break;
                }

                // Check if the item number already exists
                if (checkDuplicateItemNumber(itemNumber, file)) {
                    System.out.println("Error: Item number " + itemNumber + " already exists. Skipping item.");
                    continue;
                }

                System.out.print("Enter item description (up to 20 characters): ");
                String description = scanner.nextLine().trim();
                if (description.length() > 20) {
                    description = description.substring(0, 20);
                }

                // Append item data to file
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.format("%s%s%n", itemNumber, description));
                bufferedWriter.close();
            }

            System.out.println("Item data saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error creating or writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Helper method to check for duplicate item number in the file
    private static boolean checkDuplicateItemNumber(String itemNumber, File file) throws IOException {
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.startsWith(itemNumber)) {
                fileScanner.close();
                return true;
            }
        }
        fileScanner.close();
        return false;
    }
}
