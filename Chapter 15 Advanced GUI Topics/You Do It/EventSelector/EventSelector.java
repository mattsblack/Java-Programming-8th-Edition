import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class EventSelector extends JFrame implements ActionListener {
    private final JMenuBar mainBar = new JMenuBar();
    private final JMenu menu1 = new JMenu("File");
    private final JMenu menu2 = new JMenu("Event types");
    private final JMenuItem exit = new JMenuItem("Exit");
    private final JMenu adult = new JMenu("Adult");
    private final JMenu child = new JMenu("Child");
    private final JMenuItem adultBirthday = new JMenuItem("Birthday");
    private final JMenuItem anniversary = new JMenuItem("Anniversary");
    private final JMenuItem retirement = new JMenuItem("Retirement");
    private final JMenuItem adultOther = new JMenuItem("Other");
    private final JMenuItem childBirthday = new JMenuItem("Birthday");
    private final JMenuItem childOther = new JMenuItem("Other");
    private final JPanel birthdayPanel = new JPanel();
    private final JPanel otherPanel = new JPanel();
    private final JLabel birthdayLabel = new JLabel("Birthday events are our specialty");
    private final JLabel otherLabel = new JLabel("We have lots of ideas for memorable events");
    private final JPanel buttonPanel = new JPanel();
    private final JRadioButton radButton1 = new JRadioButton("Formal events");
    private final JRadioButton radButton2 = new JRadioButton("Casual events");

    public EventSelector() {
        setTitle("Event Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        composeMenus();
        addActionListeners();
        layoutComponents();
    }

    public void composeMenus() {
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        menu1.add(exit);
        menu2.add(adult);
        menu2.add(child);
        adult.add(adultBirthday);
        adult.add(anniversary);
        adult.add(retirement);
        adult.add(adultOther);
        child.add(childBirthday);
        child.add(childOther);
    }

    public void addActionListeners() {
        exit.addActionListener(this);
        adultBirthday.addActionListener(this);
        anniversary.addActionListener(this);
        retirement.addActionListener(this);
        adultOther.addActionListener(this);
        childBirthday.addActionListener(this);
        childOther.addActionListener(this);
    }

    public void layoutComponents() {
        birthdayPanel.setLayout(new FlowLayout());
        otherPanel.setLayout(new GridLayout(2, 1, 3, 3));
        birthdayPanel.add(birthdayLabel);
        otherPanel.add("other", otherLabel);
        otherPanel.add("buttons", buttonPanel);
        buttonPanel.add(radButton1);
        buttonPanel.add(radButton2);
        add(birthdayPanel);
        add(otherPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Container con = getContentPane();
        if(source == exit)
            System.exit(0);
        else if(source == childBirthday || source == childOther)
            con.setBackground(Color.PINK);
        else
            con.setBackground(Color.WHITE);
        if(source == adultBirthday || source == childBirthday) {
            birthdayPanel.setBackground(Color.YELLOW);
            otherPanel.setBackground(Color.WHITE);
        }
        else {
            birthdayPanel.setBackground(Color.WHITE);
            otherPanel.setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        EventSelector frame = new EventSelector();
        final int WIDTH = 400;
        final int HEIGHT = 200;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}