package JEMail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JEMail extends JFrame {

    private final JTextField toField;
    private final JTextField subjectField;
    private final JTextArea messageArea;

    public JEMail() {
        setTitle("WebBuy E-Mail Composer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for "To:" and "Subject:" fields
        JPanel topPanel = new JPanel(new GridLayout(2, 2));
        topPanel.add(new JLabel("To:"));
        toField = new JTextField();
        topPanel.add(toField);

        topPanel.add(new JLabel("Subject:"));
        subjectField = new JTextField();
        topPanel.add(subjectField);

        add(topPanel, BorderLayout.NORTH);

        // Area for "Message:" field
        messageArea = new JTextArea(10, 30);
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(messageArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for Send and Clear buttons
        JPanel bottomPanel = getBottomPanel();

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private JPanel getBottomPanel() {
        JPanel bottomPanel = new JPanel();

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendEmail();
            }
        });
        bottomPanel.add(sendButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        bottomPanel.add(clearButton);
        return bottomPanel;
    }

    private void sendEmail() {
        String to = toField.getText();
        String subject = subjectField.getText();
        String message = messageArea.getText();

        // Simulate sending email by printing the details to the console
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        // Display confirmation in the message area
        messageArea.append("\n\nMail has been sent!");
    }

    private void clearFields() {
        toField.setText("");
        subjectField.setText("");
        messageArea.setText("");
    }

    public static void main(String[] args) {
        JEMail emailComposer = new JEMail();
        emailComposer.setVisible(true);
    }
}
