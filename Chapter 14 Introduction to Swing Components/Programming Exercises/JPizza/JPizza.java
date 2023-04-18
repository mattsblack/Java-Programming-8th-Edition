package JPizza;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPizza {
    private final JList<String> sizeList;
    private final JList<String> toppingsList;
    private final JTextArea priceTextArea;

    public JPizza() {
        JFrame frame = new JFrame("Pizza Order");
        JPanel panel = new JPanel();
        String[] sizes = {"Small ($7)", "Medium ($9)", "Large ($11)", "Extra Large ($14)"};
        sizeList = new JList<>(sizes);
        String[] toppings = {"Cheese", "Pepperoni", "Mushrooms", "Onions", "Bell Peppers"};
        toppingsList = new JList<>(toppings);
        priceTextArea = new JTextArea(5, 30);
        JButton orderButton = new JButton("Place Order");

        // Set layout manager for the panel
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(new JLabel("Select pizza size:"));
        panel.add(sizeList);
        panel.add(new JLabel("Select toppings (Ctrl/Cmd-click to select multiple):"));
        panel.add(toppingsList);
        panel.add(new JLabel("Total Price:"));
        panel.add(priceTextArea);
        panel.add(orderButton);

        // Add action listener for orderButton
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calculate the total price based on the selected size and toppings
                int sizeIndex = sizeList.getSelectedIndex();
                int toppingsCount = toppingsList.getSelectedIndices().length;
                double totalPrice = 0.0;

                // Calculate base price based on selected size
                if (sizeIndex == 0) {
                    totalPrice += 7.0;
                } else if (sizeIndex == 1) {
                    totalPrice += 9.0;
                } else if (sizeIndex == 2) {
                    totalPrice += 11.0;
                } else if (sizeIndex == 3) {
                    totalPrice += 14.0;
                }

                // Add $1 for each selected topping (excluding cheese)
                totalPrice += toppingsCount;

                // Update the priceTextArea with the total price
                priceTextArea.setText("$" + totalPrice);
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the visibility of the frame
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JPizza();
    }
}
