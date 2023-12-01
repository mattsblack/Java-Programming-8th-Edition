package JColorFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JColorFrame extends JFrame implements ActionListener {
    private final JButton button = new JButton("Click me");
    private final JPanel north = new JPanel();
    private final JPanel south = new JPanel();
    private final JPanel east = new JPanel();
    private final JPanel west = new JPanel();

    public JColorFrame() {
        //set frame title
        super("JColorFrame");
        button.setSize(100,100);

        //add button and panels to frame
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(button, BorderLayout.CENTER);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //get the content pane
        Container container = getContentPane();
        Object source = e.getSource();
        //array of regions represented by numbers (1 = north, 2 = south, 3 = east, 4 = west)
        int[] regionNumber = {1,2,3,4};
        int num = (int)(Math.random() * (regionNumber.length));
        if (source == button) { //if button is clicked
            switch (regionNumber[num]) { //change the color of a random region to a random color
                case 1 -> north.setBackground(getRandomColor());
                case 2 -> south.setBackground(getRandomColor());
                case 3 -> east.setBackground(getRandomColor());
                case 4 -> west.setBackground(getRandomColor());
            }
        }
    }
    public static void main(String[] args) {
        JColorFrame frame = new JColorFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    private static Color getRandomColor() {
        return new Color((int)(Math.random() * 256), (int)(Math.random() * 256),
                (int)(Math.random() * 256));
    }
}
