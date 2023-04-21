import javax.swing.*;
import java.awt.*;

public class JBorderLayoutNoNorth extends JFrame {

    public JBorderLayoutNoNorth() {
        setLayout(new BorderLayout());
        JButton sb = new JButton("South");
        add(sb, BorderLayout.SOUTH);
        JButton eb = new JButton("East");
        add(eb, BorderLayout.EAST);
        JButton wb = new JButton("West");
        add(wb, BorderLayout.WEST);
        JButton cb = new JButton("Center");
        add(cb, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JBorderLayoutNoNorth frame = new JBorderLayoutNoNorth();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}