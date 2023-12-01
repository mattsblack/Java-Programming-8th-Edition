package JPanelDemo;

import java.awt.*;
import javax.swing.*;

public class JPanelDemo extends JFrame {
    Container container = null;
    JFlexiblePanel panel1 = new JFlexiblePanel(Color.RED, Color.BLACK, new Font("Arial", Font.BOLD, 24), "North");
    JFlexiblePanel panel2 = new JFlexiblePanel(Color.BLUE, Color.WHITE, new Font("Arial", Font.BOLD, 24), "South");
    JFlexiblePanel panel3 = new JFlexiblePanel(Color.GREEN, Color.BLACK, new Font("Arial", Font.BOLD, 24), "East");
    JFlexiblePanel panel4 = new JFlexiblePanel(Color.YELLOW, Color.BLACK, new Font("Arial", Font.BOLD, 24), "West");

    public JPanelDemo() {
        container = this.getContentPane();
        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JPanelDemo jpanel = new JPanelDemo();
        jpanel.setSize(400,400);
        jpanel.setVisible(true);
    }
}
