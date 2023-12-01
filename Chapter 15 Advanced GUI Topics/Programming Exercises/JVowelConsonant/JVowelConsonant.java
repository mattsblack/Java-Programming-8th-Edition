package JVowelConsonant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class JVowelConsonant extends JFrame {
    private final String[] vowels = {"A", "E", "I", "O", "U"};

    private JLabel label;
    public JVowelConsonant() {
        super("Vowel or Consonant");
        // Create the buttons for each region
        JButton[] buttons = new JButton[26];
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i); // A, B, C, ...
            buttons[i] = new JButton(String.valueOf(letter));
        }

        //create three panels with a two-by-two grid layout
        JPanel panel1 = new JPanel(new GridLayout(2, 2));
        JPanel panel2 = new JPanel(new GridLayout(2, 2));
        JPanel panel3 = new JPanel(new FlowLayout());

        //randomly select eight buttons and add them to the panels
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index1 = random.nextInt(26);
            int index2 = random.nextInt(26);
            panel1.add(buttons[index1]);
            panel2.add(buttons[index2]);
        }

        // Create a label and add it to the third panel
        label = new JLabel();
        panel3.add(label);

        // Attach ActionListener to each button
        for (JButton button : buttons) {
            button.addActionListener(new ButtonActionListener());
        }

        // Set the layout of the JFrame as BorderLayout
        setLayout(new BorderLayout());

        // Add the panels to their respective regions
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
    }

     private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String letter = button.getText();

            // Determine if the clicked letter is a vowel or a consonant
            String category;
            if (isVowel(letter)) {
                category = "Vowel";
            } else {
                category = "Consonant";
            }

            // Set the label text to the category
            label.setText(category);

            // Randomly select a new letter and replace the button's text
            Random random = new Random();
            int index = random.nextInt(26);
            button.setText(String.valueOf((char) ('A' + index)));
        }
    }

    private boolean isVowel(String letter) {
        return containsIgnoreCase(vowels, letter);
    }

    private boolean containsIgnoreCase(String[] array, String target) {
        for (String s : array) {
            if (s.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JVowelConsonant frame = new JVowelConsonant();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
