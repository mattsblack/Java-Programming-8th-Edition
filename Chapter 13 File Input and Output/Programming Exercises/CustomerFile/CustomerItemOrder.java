package CustomerFile;

import java.io.*;
import java.util.*;

public class CustomerItemOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerFileName = "customers.txt"; // File name for customer data
        String itemFileName = "items.txt"; // File name for item data

        // Load customer data into a map for easy lookup
        Map<String, String> customerData = loadCustomerData(customerFileName);

        // Load item data into a map for easy lookup
        Map<String, String> itemData = loadItemData(itemFileName);

        // Prompt user for input
        System.out.print("Enter customer number: ");
        String customerNumber = scanner.nextLine().trim();
        if (!customerData.containsKey(customerNumber)) {
            System.out.println("Error: Customer number " + customerNumber + " does not exist.");
            return;
        }

        System.out.print("Enter item number: ");
        String itemNumber = scanner.nextLine().trim();
        if (!itemData.containsKey(itemNumber)) {
            System.out.println("Error: Item number " + itemNumber + " does not exist.");
            return;
        }

        // Display customer and item information
        System.out.println("Customer Information:");
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Customer Name: " + customerData.get(customerNumber));
        System.out.println("Item Information:");
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Item Description: " + itemData.get(itemNumber));

        scanner.close();
    }

    // Helper method to load customer data from file into a map
    private static Map<String, String> loadCustomerData(String fileName) {
        Map<String, String> customerData = new HashMap<>();
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    String customerNumber = parts[0];
                    String customerName = parts[1];
                    customerData.put(customerNumber, customerName);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error loading customer data from file: " + e.getMessage());
        }
        return customerData;
    }

    // Helper method to load item data from file into a map
    private static Map<String, String> loadItemData(String fileName) {
        Map<String, String> itemData = new HashMap<>();
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    String itemNumber = parts[0];
                    String itemDescription = parts[1];
                    itemData.put(itemNumber, itemDescription);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error loading item data from file: " + e.getMessage());
        }
        return itemData;
    }
}
