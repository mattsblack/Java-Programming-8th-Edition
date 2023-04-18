package JDorm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JDorm2 extends JFrame implements ActionListener {
    private final JCheckBox privateRoomCheckBox;
    private final JCheckBox internetCheckBox;
    private final JCheckBox cableTvCheckBox;
    private final JCheckBox microwaveCheckBox;
    private final JCheckBox refrigeratorCheckBox;
    private final JTextArea messageTextArea;

    public JDorm2() {
        // Set up the JFrame
        setTitle("JDorm - Dormitory Room Options");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for checkboxes
        JPanel checkBoxPanel = new JPanel(new GridLayout(5, 1));
        privateRoomCheckBox = new JCheckBox("Private Room");
        internetCheckBox = new JCheckBox("Internet Connection");
        cableTvCheckBox = new JCheckBox("Cable TV Connection");
        microwaveCheckBox = new JCheckBox("Microwave");
        refrigeratorCheckBox = new JCheckBox("Refrigerator");
        checkBoxPanel.add(privateRoomCheckBox);
        checkBoxPanel.add(internetCheckBox);
        checkBoxPanel.add(cableTvCheckBox);
        checkBoxPanel.add(microwaveCheckBox);
        checkBoxPanel.add(refrigeratorCheckBox);

        // Create panel for message display
        JPanel messagePanel = new JPanel(new BorderLayout());
        messageTextArea = new JTextArea(10, 20);
        messageTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageTextArea);
        messagePanel.add(new JLabel("Current Choices:"), BorderLayout.NORTH);
        messagePanel.add(scrollPane, BorderLayout.CENTER);

        // Add action listeners to checkboxes
        privateRoomCheckBox.addActionListener(this);
        internetCheckBox.addActionListener(this);
        cableTvCheckBox.addActionListener(this);
        microwaveCheckBox.addActionListener(this);
        refrigeratorCheckBox.addActionListener(this);

        // Add panels to split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, checkBoxPanel, messagePanel);
        splitPane.setDividerLocation(150);

        // Add split pane to frame
        add(splitPane);

        // Set frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the selected options
        ArrayList<String> selectedOptions = new ArrayList<>();
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

        // Update the messageTextArea with current choices
        messageTextArea.setText(String.join(", ", selectedOptions));
    }

    public static void main(String[] args) {
        // Create an instance of JDorm2
        new JDorm2();
    }
}
