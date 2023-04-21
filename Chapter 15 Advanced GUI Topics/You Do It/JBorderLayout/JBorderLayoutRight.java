import javax.swing.*;
import java.awt.*;

public class JBorderLayoutRight extends JFrame {

    public JBorderLayoutRight() {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton nb = new JButton("North");
        add(nb);
        JButton sb = new JButton("South");
        add(sb);
        JButton eb = new JButton("East");
        add(eb);
        JButton wb = new JButton("West");
        add(wb);
        JButton cb = new JButton("Center");
        add(cb);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JBorderLayoutRight frame = new JBorderLayoutRight();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}