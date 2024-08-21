package JLeftOrRight;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JLeftOrRight extends JFrame {

    private JLabel label;

    public JLeftOrRight() {
        setTitle("Mouse Button Modifier Test");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Click anywhere on the window", JLabel.CENTER);
        add(label);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int modifiers = e.getModifiers();
                String button = "";

                if ((modifiers & MouseEvent.BUTTON1_MASK) != 0) {
                    button = "Left Button";
                } else if ((modifiers & MouseEvent.BUTTON2_MASK) != 0) {
                    button = "Middle Button";
                } else if ((modifiers & MouseEvent.BUTTON3_MASK) != 0) {
                    button = "Right Button";
                }

                System.out.println("Button clicked: " + button + " (Modifiers value: " + modifiers + ")");
                label.setText("You clicked: " + button + " (Modifiers: " + modifiers + ")");
            }
        });
    }

    public static void main(String[] args) {
        JLeftOrRight frame = new JLeftOrRight();
        frame.setVisible(true);
    }
}
