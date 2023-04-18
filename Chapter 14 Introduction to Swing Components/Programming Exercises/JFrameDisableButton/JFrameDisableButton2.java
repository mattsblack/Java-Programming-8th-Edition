package JFrameDisableButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 {
    private static final int MAX_CLICKS = 8; // Maximum number of clicks allowed
    private static int clickCount = 0; // Counter for number of clicks

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Disable Button Example");
        
        // Set the size of the frame
        frame.setSize(400, 200);
        
        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());
        
        // Create a JButton
        JButton button = new JButton("Click me!");
        
        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Increment click count
                clickCount++;
                
                // Check if click count exceeds maximum clicks allowed
                if (clickCount >= MAX_CLICKS) {
                    // Disable the button
                    button.setEnabled(false);
                    
                    // Create a JLabel indicating "That's enough!"
                    JLabel label = new JLabel("That's enough!");
                    
                    // Add the label to the frame
                    frame.add(label);
                    
                    // Repaint the frame to reflect changes
                    frame.revalidate();
                }
            }
        });
        
        // Add the button to the frame
        frame.add(button);
        
        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
