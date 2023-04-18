package JTVDownload;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload {
    private final JComboBox<String> showComboBox;
    private final JTextArea synopsisTextArea;

    private final String[] synopses = {
            "Game of Thrones: Epic fantasy drama television series based on the 'A Song of Ice and Fire' novels.",
            "Breaking Bad: Crime drama television series about a high school chemistry teacher turned methamphetamine manufacturer.",
            "Stranger Things: Supernatural science fiction horror television series about a group of kids in a small town.",
            "Friends: Popular sitcom television series following the lives of six friends in New York City.",
            "The Office: Mockumentary sitcom television series depicting the everyday lives of office employees at Dunder Mifflin."
    };

    public JTVDownload() {
        JFrame frame = new JFrame("TV Show Download");
        JPanel panel = new JPanel();
        String[] shows = {"Game of Thrones", "Breaking Bad", "Stranger Things", "Friends", "The Office"};
        showComboBox = new JComboBox<>(shows);
        synopsisTextArea = new JTextArea(5, 30);

        // Set layout manager for the panel
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(new JLabel("Select a TV show:"));
        panel.add(showComboBox);
        panel.add(new JLabel("Synopsis:"));
        panel.add(synopsisTextArea);

        // Add action listener for showComboBox
        showComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected show index
                int selectedIndex = showComboBox.getSelectedIndex();
                // Update the synopsisTextArea with the corresponding synopsis
                synopsisTextArea.setText(synopses[selectedIndex]);
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
        new JTVDownload();
    }
}
