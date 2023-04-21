import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCardLayout2 extends JFrame implements ActionListener {

    CardLayout cardLayout = new CardLayout();

    public JCardLayout2() {
        setLayout(cardLayout);
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
        nb.addActionListener(this);
        sb.addActionListener(this);
        eb.addActionListener(this);
        wb.addActionListener(this);
        cb.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(getContentPane());
    }

    public static void main(String[] args) {
        JCardLayout2 frame = new JCardLayout2();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}