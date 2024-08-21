package RandomEmployeeFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomEmployeeFile extends JFrame {

    private JTextField idField;
    private JTextArea displayArea;
    private JButton retrieveButton;
    private RandomAccessFile employeeFile;

    private static final int RECORD_SIZE = 100; // Total record size in bytes
    private static final int ID_SIZE = 4;       // Employee ID size (int)
    private static final int NAME_SIZE = 30;    // First name/last name size (15 chars each)
    private static final int PAY_RATE_SIZE = 8; // Hourly pay rate size (double)

    public ReadRandomEmployeeFile() {
        super("Employee Data Retrieval");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for Employee ID input
        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        topPanel.add(new JLabel("Enter Employee ID (1-99):"));
        idField = new JTextField();
        topPanel.add(idField);
        add(topPanel, BorderLayout.NORTH);

        // Area to display the retrieved data
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        // Retrieve button
        retrieveButton = new JButton("Retrieve Data");
        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retrieveEmployeeData();
            }
        });
        add(retrieveButton, BorderLayout.SOUTH);

        // Initialize the random access file
        try {
            employeeFile = new RandomAccessFile("employee.dat", "r");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error opening file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private void retrieveEmployeeData() {
        try {
            int id = Integer.parseInt(idField.getText());
            if (id < 1 || id > 99) {
                JOptionPane.showMessageDialog(this, "Employee ID must be between 1 and 99.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Seek to the correct position in the file
            employeeFile.seek((id - 1) * RECORD_SIZE);

            // Read the data
            int storedId = employeeFile.readInt();
            if (storedId == 0) {
                displayArea.setText("No data found for Employee ID: " + id);
                return;
            }

            char[] firstNameChars = new char[NAME_SIZE / 2];
            for (int i = 0; i < firstNameChars.length; i++) {
                firstNameChars[i] = employeeFile.readChar();
            }
            String firstName = new String(firstNameChars).trim();

            char[] lastNameChars = new char[NAME_SIZE / 2];
            for (int i = 0; i < lastNameChars.length; i++) {
                lastNameChars[i] = employeeFile.readChar();
            }
            String lastName = new String(lastNameChars).trim();

            double payRate = employeeFile.readDouble();

            // Display the data
            displayArea.setText("Employee ID: " + storedId + "\n"
                    + "First Name: " + firstName + "\n"
                    + "Last Name: " + lastName + "\n"
                    + "Hourly Pay Rate: $" + String.format("%.2f", payRate));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numerical Employee ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        ReadRandomEmployeeFile app = new ReadRandomEmployeeFile();
        app.setVisible(true);
    }
}

