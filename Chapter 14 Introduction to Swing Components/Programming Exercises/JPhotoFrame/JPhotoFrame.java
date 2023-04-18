package JPhotoFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPhotoFrame extends JFrame implements ActionListener {
    private final JRadioButton onePersonRadioButton;
    private final JRadioButton twoOrMorePersonsRadioButton;
    private final JRadioButton petRadioButton;
    private final JRadioButton onLocationRadioButton;
    private final JLabel priceLabel;

    public JPhotoFrame() {
        // Set up the JFrame
        setTitle("Paula's Portraits");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for portrait subject selection
        JPanel portraitSubjectPanel = new JPanel(new GridLayout(3, 1));
        portraitSubjectPanel.setBorder(BorderFactory.createTitledBorder("Portrait Subject"));
        onePersonRadioButton = new JRadioButton("One Person ($40)");
        twoOrMorePersonsRadioButton = new JRadioButton("Two or More Persons ($75)");
        petRadioButton = new JRadioButton("Pet ($95)");
        ButtonGroup portraitSubjectGroup = new ButtonGroup();
        portraitSubjectGroup.add(onePersonRadioButton);
        portraitSubjectGroup.add(twoOrMorePersonsRadioButton);
        portraitSubjectGroup.add(petRadioButton);
        portraitSubjectPanel.add(onePersonRadioButton);
        portraitSubjectPanel.add(twoOrMorePersonsRadioButton);
        portraitSubjectPanel.add(petRadioButton);

        // Create panel for session location selection
        JPanel sessionLocationPanel = new JPanel(new GridLayout(2, 1));
        sessionLocationPanel.setBorder(BorderFactory.createTitledBorder("Session Location"));
        JRadioButton inStudioRadioButton = new JRadioButton("In Studio ($0)");
        onLocationRadioButton = new JRadioButton("On Location ($90)");
        ButtonGroup sessionLocationGroup = new ButtonGroup();
        sessionLocationGroup.add(inStudioRadioButton);
        sessionLocationGroup.add(onLocationRadioButton);
        sessionLocationPanel.add(inStudioRadioButton);
        sessionLocationPanel.add(onLocationRadioButton);

        // Create panel for price display
        JPanel pricePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        priceLabel = new JLabel("Price: $0");
        pricePanel.add(priceLabel);

        // Add action listeners to radio buttons
        onePersonRadioButton.addActionListener(this);
        twoOrMorePersonsRadioButton.addActionListener(this);
        petRadioButton.addActionListener(this);
        inStudioRadioButton.addActionListener(this);
        onLocationRadioButton.addActionListener(this);

        // Add panels to frame
        setLayout(new BorderLayout());
        add(portraitSubjectPanel, BorderLayout.WEST);
        add(sessionLocationPanel, BorderLayout.EAST);
        add(pricePanel, BorderLayout.SOUTH);

        // Set frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Calculate price based on selected options
        int basePrice = 0;
        int inStudioFee = 0;
        int onLocationFee = 0;

        if (onePersonRadioButton.isSelected()) {
            basePrice = 40;
        } else if (twoOrMorePersonsRadioButton.isSelected()) {
            basePrice = 75;
        } else if (petRadioButton.isSelected()) {
            basePrice = 95;
        }

        if (onLocationRadioButton.isSelected()) {
            onLocationFee = 90;
        }

        int totalPrice = basePrice + inStudioFee + onLocationFee;

        // Update price label
        priceLabel.setText("Price: $" + totalPrice);
    }

    public static void main(String[] args) {
        new JPhotoFrame();
    }
}