import javax.swing.*;
import java.awt.*;

public class JCardLayout extends JFrame {

    public JCardLayout() {
        setLayout(new CardLayout());
        JButton nb = new JButton("North");
        add("north", nb);
        JButton sb = new JButton("South");
        add("south", sb);
        JButton eb = new JButton("East");
        add("east", eb);
        JButton wb = new JButton("West");
        add("west", wb);
        JButton cb = new JButton("Center");
        add("center", cb);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JCardLayout frame = new JCardLayout();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}