package JPanelDemo;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {
    JLabel label = new JLabel();
    public JFlexiblePanel(Color bgColor, Color fgColor, Font font, String displayText) {
        this.add(label);
        label.setText(displayText);
        label.setFont(font);
        this.setBackground(bgColor);
        label.setForeground(fgColor);
    }
}
