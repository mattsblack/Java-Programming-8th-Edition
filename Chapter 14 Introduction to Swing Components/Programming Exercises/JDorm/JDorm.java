package JDorm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JDorm {
    private final JCheckBox privateRoomCheckBox;
    private final JCheckBox internetCheckBox;
    private final JCheckBox cableTvCheckBox;
    private final JCheckBox microwaveCheckBox;
    private final JCheckBox refrigeratorCheckBox;
    private final JTextArea messageTextArea;

    private final ArrayList<String> selectedOptions;

    public JDorm() {
        JFrame frame = new JFrame("Dormitory Room Options");
        JPanel panel = new JPanel();
        privateRoomCheckBox = new JCheckBox("Private Room");
        internetCheckBox = new JCheckBox("Internet Connection");
        cableTvCheckBox = new JCheckBox("Cable TV Connection");
        microwaveCheckBox = new JCheckBox("Microwave");
        refrigeratorCheckBox = new JCheckBox("Refrigerator");
        messageTextArea = new JTextArea(10, 30);

        // Add action listeners for the checkboxes
        privateRoomCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMessageTextArea();
            }
        });

        internetCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMessageTextArea();
            }
        });

        cableTvCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMessageTextArea();
            }
        });

        microwaveCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMessageTextArea();
            }
        });

        refrigeratorCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMessageTextArea();
            }
        });

        // Set layout manager for the panel
        panel.setLayout(new FlowLayout());

        // Add components to the panel
        panel.add(privateRoomCheckBox);
        panel.add(internetCheckBox);
        panel.add(cableTvCheckBox);
        panel.add(microwaveCheckBox);
        panel.add(refrigeratorCheckBox);

        // Add the panel and messageTextArea to a split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, new JScrollPane(messageTextArea));
        splitPane.setDividerLocation(200);

        // Add the split pane to the frame
        frame.add(splitPane);

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the visibility of the frame
        frame.pack();
        frame.setVisible(true);

        // Initialize the selectedOptions ArrayList
        selectedOptions = new ArrayList<>();
        updateMessageTextArea();
    }

    private void updateMessageTextArea() {
        selectedOptions.clear();

        // Check the selected options and add them to the selectedOptions ArrayList
        if (privateRoomCheckBox.isSelected()) {
            selectedOptions.add("Private Room");
        }

        if (internetCheckBox.isSelected()) {
            selectedOptions.add("Internet Connection");
        }

        if (cableTvCheckBox.isSelected()) {
            selectedOptions.add("Cable TV Connection");
        }

        if (microwaveCheckBox.isSelected()) {
            selectedOptions.add("Microwave");
        }

        if (refrigeratorCheckBox.isSelected()) {
            selectedOptions.add("Refrigerator");
        }

        // Update the messageTextArea with the list of selected options
        String message = "Selected Options:\n";
        if (!selectedOptions.isEmpty()) {
            for (String option : selectedOptions) {
                message += "- " + option + "\n";
            }
        } else {
            message += "None";
        }

        messageTextArea.setText(message);
    }

    public static void main(String[] args) {
        new JDorm();
    }
}
