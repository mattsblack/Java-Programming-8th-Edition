package JVacationRental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental {
    private static final int PARKSIDE_PRICE = 600;
    private static final int POOLSIDE_PRICE = 750;
    private static final int LAKESIDE_PRICE = 825;
    private static final int BEDROOM_PRICE = 75;
    private static final int MEAL_PRICE = 200;

    private static JRadioButton parksideButton;
    private static JRadioButton poolsideButton;
    private static JRadioButton lakesideButton;
    private static JRadioButton oneBedroomButton;
    private static JRadioButton twoBedroomsButton;
    private static JRadioButton threeBedroomsButton;
    private static JRadioButton mealsIncludedButton;
    private static JButton calculateButton;
    private static JLabel resultLabel;
    
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Lambert's Vacation Rentals");
        
        // Set the size of the frame
        frame.setSize(400, 300);
        
        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());
        
        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        
        // Create the location selection components
        JLabel locationLabel = new JLabel("Select Location:");
        parksideButton = new JRadioButton("Parkside ($" + PARKSIDE_PRICE + "/week)");
        poolsideButton = new JRadioButton("Poolside ($" + POOLSIDE_PRICE + "/week)");
        lakesideButton = new JRadioButton("Lakeside ($" + LAKESIDE_PRICE + "/week)");
        ButtonGroup locationGroup = new ButtonGroup();
        locationGroup.add(parksideButton);
        locationGroup.add(poolsideButton);
        locationGroup.add(lakesideButton);
        
        // Create the bedrooms selection components
        JLabel bedroomsLabel = new JLabel("Select Bedrooms:");
        oneBedroomButton = new JRadioButton("1 Bedroom ($0)");
        twoBedroomsButton = new JRadioButton("2 Bedrooms ($" + BEDROOM_PRICE + "/week)");
        threeBedroomsButton = new JRadioButton("3 Bedrooms ($" + (BEDROOM_PRICE * 2) + "/week)");
        ButtonGroup bedroomsGroup = new ButtonGroup();
        bedroomsGroup.add(oneBedroomButton);
        bedroomsGroup.add(twoBedroomsButton);
        bedroomsGroup.add(threeBedroomsButton);
        
        // Create the meal inclusion selection components
        JLabel mealLabel = new JLabel("Meals Included?");
        mealsIncludedButton = new JRadioButton("Meals Included ($" + MEAL_PRICE + "/week)");
        JRadioButton noMealsButton = new JRadioButton("No Meals Included ($0)");
        ButtonGroup mealGroup = new ButtonGroup();
        mealGroup.add(mealsIncludedButton);
        mealGroup.add(noMealsButton);
        
        // Create the calculate button
        calculateButton = new JButton("Calculate Total");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                
                // Calculate total based on selected options
                if (parksideButton.isSelected()) {
                    total += PARKSIDE_PRICE;
                } else if (poolsideButton.isSelected()) {
                    total += POOLSIDE_PRICE;
                } else if (lakesideButton.isSelected()) {
                    total += LAKESIDE_PRICE;
                }
                if (twoBedroomsButton.isSelected()) {
                    total += BEDROOM_PRICE;
                } else if (threeBedroomsButton.isSelected()) {
                    total += BEDROOM_PRICE * 2;
                }
                if (mealsIncludedButton.isSelected()) {
                total += MEAL_PRICE;
                }

            // Display the result
            resultLabel.setText("Total: $" + total + "/week");

            // Disable the calculate button after calculating
            calculateButton.setEnabled(false);
        }
    });

        // Create the result label
        resultLabel = new JLabel();

        // Add components to the panel
        panel.add(locationLabel);
        panel.add(parksideButton);
        panel.add(poolsideButton);
        panel.add(lakesideButton);
        panel.add(bedroomsLabel);
        panel.add(oneBedroomButton);
        panel.add(twoBedroomsButton);
        panel.add(threeBedroomsButton);
        panel.add(mealLabel);
        panel.add(mealsIncludedButton);
        panel.add(noMealsButton);
        panel.add(calculateButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set default selection for each group
        parksideButton.setSelected(true);
        oneBedroomButton.setSelected(true);
        noMealsButton.setSelected(true);

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the visibility of the frame
        frame.setVisible(true);
    }
}
