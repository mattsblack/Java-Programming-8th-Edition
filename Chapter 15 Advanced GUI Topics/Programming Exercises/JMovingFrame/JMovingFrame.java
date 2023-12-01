package JMovingFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JMovingFrame extends JFrame implements ActionListener {
    private int num = 1;
    private JButton button = new JButton("Click me");
    private JLabel label = new JLabel("I'm a label");
    private final JPanel panel1 = new JPanel(new FlowLayout());
    private final JPanel panel2 = new JPanel(new FlowLayout());
    private final JPanel panel3 = new JPanel(new FlowLayout());
    private final JPanel panel4 = new JPanel(new FlowLayout());
    public JMovingFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.NORTH);
        add(panel3, BorderLayout.EAST);
        add(panel4, BorderLayout.SOUTH);

        panel4.add(button);
        panel1.add(label);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        JMovingFrame frame = new JMovingFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (num) {
            case 1 -> {
                panel2.remove(label);
                panel2.repaint();
                panel3.add(label);
                num = 2;
            }
            case 2 -> {
                panel3.remove(label);
                panel3.repaint();
                panel4.add(label);
                num = 3;
            }
            case 3 -> {
                panel4.remove(label);
                panel4.repaint();
                panel1.add(label);
                num = 1;
            }
        }
        validate();
    }
}
