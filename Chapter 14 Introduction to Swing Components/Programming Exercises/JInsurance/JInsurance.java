package JInsurance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JInsurance {
    private final JRadioButton hmoRadioButton;
    private final JRadioButton ppoRadioButton;
    private final JCheckBox dentalCheckBox;
    private final JCheckBox visionCheckBox;
    private final JTextField priceTextField;

    public JInsurance() {
        JFrame frame = new JFrame("Insurance Options");
        JPanel panel = new JPanel();
        hmoRadioButton = new JRadioButton("HMO");
        ppoRadioButton = new JRadioButton("PPO");
        dentalCheckBox = new JCheckBox("Dental Insurance");
        visionCheckBox = new JCheckBox("Vision Insurance");
        priceTextField = new JTextField(10);

        // Create a ButtonGroup to group the radio buttons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(hmoRadioButton);
        buttonGroup.add(ppoRadioButton);

        // Add action listeners for the radio buttons and check boxes
        hmoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePriceTextField();
            }
        });

        ppoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePriceTextField();
            }
        });

        dentalCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePriceTextField();
            }
        });

        visionCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePriceTextField();
            }
        });

        // Set layout manager for the panel
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(new JLabel("Insurance Type:"));
        panel.add(hmoRadioButton);
        panel.add(ppoRadioButton);
        panel.add(new JLabel("Additional Options:"));
        panel.add(dentalCheckBox);
        panel.add(visionCheckBox);
        panel.add(new JLabel("Total Price:"));
        panel.add(priceTextField);

        // Add the panel to the frame
        frame.add(panel);

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the visibility of the frame
        frame.pack();
        frame.setVisible(true);
    }

    private void updatePriceTextField() {
        double totalPrice = 0.0;

        // Check the selected insurance type and add the corresponding price
        if (hmoRadioButton.isSelected()) {
            double HMO_PRICE = 200.0;
            totalPrice += HMO_PRICE;
        } else if (ppoRadioButton.isSelected()) {
            double PPO_PRICE = 600.0;
            totalPrice += PPO_PRICE;
        }

        // Check the selected additional options and add the corresponding prices
        if (dentalCheckBox.isSelected()) {
            double DENTAL_PRICE = 75.0;
            totalPrice += DENTAL_PRICE;
        }

        if (visionCheckBox.isSelected()) {
            double VISION_PRICE = 20.0;
            totalPrice += VISION_PRICE;
        }

        // Update the priceTextField with the total price
        priceTextField.setText("$" + totalPrice);
    }

    public static void main(String[] args) {
        new JInsurance();
    }
}
