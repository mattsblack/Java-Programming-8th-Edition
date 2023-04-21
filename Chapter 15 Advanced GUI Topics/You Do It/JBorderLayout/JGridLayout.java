import javax.swing.*;
import java.awt.*;

public class JGridLayout extends JFrame {

    public JGridLayout() {
        setLayout(new GridLayout(2,3,2,4));
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
        JGridLayout frame = new JGridLayout();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}