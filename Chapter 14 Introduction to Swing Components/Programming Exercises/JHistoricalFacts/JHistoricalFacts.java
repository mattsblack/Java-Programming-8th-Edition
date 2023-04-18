package JHistoricalFacts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts {
    private static final String[] FACTS = {
        "The Great Wall of China is visible from space.",
        "The first successful powered flight by the Wright brothers was in 1903.",
        "The Declaration of Independence was adopted on July 4, 1776.",
        "The Eiffel Tower in Paris was completed in 1889.",
        "The Titanic sank on April 15, 1912."
    };

    private static JPanel panel;
    private static JLabel[] labels;
    
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Historical Facts");
        
        // Set the size of the frame
        frame.setSize(400, 200);
        
        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());
        
        // Create a JPanel to hold the labels
        panel = new JPanel();
        
        // Set the layout manager for the panel
        panel.setLayout(new GridLayout(5, 1));
        
        // Create labels with initial historical facts
        labels = new JLabel[5];
        for (int i = 0; i < 5; i++) {
            labels[i] = new JLabel(FACTS[i]);
            panel.add(labels[i]);
        }
        
        // Create a JButton
        JButton button = new JButton("Next Fact");
        
        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove a random label from the panel
                int indexToRemove = (int) (Math.random() * 5);
                panel.remove(labels[indexToRemove]);
                
                // Add a new label with a different historical fact
                String newFact;
                do {
                    newFact = FACTS[(int) (Math.random() * 5)];
                } while (newFact.equals(labels[indexToRemove].getText())); // Make sure the new fact is different from the removed label
                
                labels[indexToRemove] = new JLabel(newFact);
                panel.add(labels[indexToRemove]);
                
                // Repaint the panel to reflect changes
                panel.revalidate();
                panel.repaint();
            }
        });
        
        // Add the panel and button to the frame
        frame.add(panel);
        frame.add(button);
        
        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
