package JFontSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JFontSelector extends JFrame {

    private Font currentFont;
    private int currentSize;
    private final JLabel demoLabel;

    public JFontSelector() {
        super("Font Selector");

        //create buttons for font selection
        JButton fontButton1 = new JButton("Arial");
        JButton fontButton2 = new JButton("Times New Roman");
        JButton fontButton3 = new JButton("Verdana");
        JButton fontButton4 = new JButton("Courier New");
        JButton fontButton5 = new JButton("Impact");
        JButton sizeButton = new JButton("Change Size");

        //set default font and size
        currentFont = new Font("Arial", Font.PLAIN, 12);
        currentSize = 12;

        //create a label to display the font
        demoLabel = new JLabel("Sample Text");
        demoLabel.setFont(currentFont);

        //set layout as FlowLayout
        setLayout(new FlowLayout());

        //add buttons to JFrame
        add(fontButton1);
        add(fontButton2);
        add(fontButton3);
        add(fontButton4);
        add(fontButton5);
        add(sizeButton);
        add(demoLabel);

        //attach ActionListener to each button
        fontButton1.addActionListener(new FontButtonActionListener());
        fontButton2.addActionListener(new FontButtonActionListener());
        fontButton3.addActionListener(new FontButtonActionListener());
        fontButton4.addActionListener(new FontButtonActionListener());
        fontButton5.addActionListener(new FontButtonActionListener());

        //add ActionListener to sizeButton
        sizeButton.addActionListener(new SizeButtonActionListener());
    }

    private class FontButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String fontName = button.getText();

            // Create a new font based on the selected font name and current size
            currentFont = new Font(fontName, Font.PLAIN, currentSize);

            // Update the font of the demonstration label
            demoLabel.setFont(currentFont);
        }
    }

    private class SizeButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Toggle the font size between 12 and 16
            if (currentSize == 12) {
                currentSize = 16;
            } else {
                currentSize = 12;
            }

            // Create a new font based on the current font name and updated size
            currentFont = new Font(currentFont.getFontName(), Font.PLAIN, currentSize);

            // Update the font of the demonstration label
            demoLabel.setFont(currentFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFontSelector frame = new JFontSelector();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
