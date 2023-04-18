package JFrameDisableButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton {
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
                // Disable the button
                button.setEnabled(false);
            }
        });
        
        // Add the button to the frame
        frame.add(button);
        
        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
