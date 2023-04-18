package JCapitals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class JCapitals {
    private final JComboBox<String> countryComboBox;
    private final JTextArea capitalTextArea;

    private final Map<String, String> capitals = new HashMap<>();

    public JCapitals() {
        JFrame frame = new JFrame("Country Capitals");
        JPanel panel = new JPanel();
        countryComboBox = new JComboBox<>();
        capitalTextArea = new JTextArea(5, 30);

        // Add countries to the combo box
        countryComboBox.addItem("United States");
        countryComboBox.addItem("Canada");
        countryComboBox.addItem("Mexico");
        countryComboBox.addItem("United Kingdom");
        countryComboBox.addItem("France");
        countryComboBox.addItem("Germany");
        countryComboBox.addItem("Japan");

        // Add action listener for countryComboBox
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected country from the combo box
                String selectedCountry = (String) countryComboBox.getSelectedItem();

                // Get the capital city based on the selected country
                String capital = capitals.get(selectedCountry);

                // Update the capitalTextArea with the capital city
                capitalTextArea.setText("Capital City: " + capital);
            }
        });

        // Set layout manager for the panel
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(new JLabel("Select a country:"));
        panel.add(countryComboBox);
        panel.add(capitalTextArea);

        // Add the panel to the frame
        frame.add(panel);

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the visibility of the frame
        frame.pack();
        frame.setVisible(true);

        // Initialize the map of country capitals
        initCapitalsMap();
    }

    private void initCapitalsMap() {
        // Populate the map with country-capital pairs
        capitals.put("United States", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Mexico", "Mexico City");
        capitals.put("United Kingdom", "London");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
    }

    public static void main(String[] args) {
        new JCapitals();
    }
}
