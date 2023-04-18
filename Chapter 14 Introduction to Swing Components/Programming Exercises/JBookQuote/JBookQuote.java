package JBookQuote;

import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Favorite Book");
        
        // Set the size of the frame
        frame.setSize(400, 200);
        
        // Set the layout manager for the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        // Create a JLabel to display the book sentence
        JLabel label = new JLabel("It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.");
        
        // Set font for the label
        label.setFont(label.getFont().deriveFont(18.0f));
        
        // Add the label to the frame
        frame.add(label);
        
        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
