package RandomEmployeeFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateRandomEmployeeFile extends JFrame {

    private final JTextField idField;
    private final JTextField firstNameField;
    private final JTextField lastNameField;
    private final JTextField payRateField;
    private RandomAccessFile employeeFile;

    private static final int RECORD_SIZE = 100; // Total record size in bytes

    public CreateRandomEmployeeFile() {
        super("Employee Data Entry");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Creating the input fields
        add(new JLabel("Employee ID (1-99):"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Hourly Pay Rate:"));
        payRateField = new JTextField();
        add(payRateField);

        // Creating the Save button
        JButton saveButton = new JButton("Save Record");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveRecord();
            }
        });
        add(saveButton);

        // Initialize the random access file
        try {
            employeeFile = new RandomAccessFile("employee.dat", "rw");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error opening file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private void saveRecord() {
        try {
            int id = Integer.parseInt(idField.getText());
            if (id < 1 || id > 99) {
                JOptionPane.showMessageDialog(this, "Employee ID must be between 1 and 99.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String firstName = padString(firstNameField.getText());
            String lastName = padString(lastNameField.getText());
            double payRate = Double.parseDouble(payRateField.getText());

            // Seek to the correct position in the file
            employeeFile.seek((id - 1) * RECORD_SIZE);

            // Write the data
            employeeFile.writeInt(id);
            employeeFile.writeChars(firstName);
            employeeFile.writeChars(lastName);
            employeeFile.writeDouble(payRate);

            JOptionPane.showMessageDialog(this, "Record saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Clear the fields
            idField.setText("");
            firstNameField.setText("");
            lastNameField.setText("");
            payRateField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values for ID and Pay Rate.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String padString(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.setLength(15);
        return sb.toString();
    }

    public static void main(String[] args) {
        CreateRandomEmployeeFile app = new CreateRandomEmployeeFile();
        app.setVisible(true);
    }
}

