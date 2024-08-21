package JavaJuniorCollege;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJuniorCollege extends JFrame {

    public JavaJuniorCollege() {
        setTitle("Java Junior College");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "Campuses" menu
        JMenu campusesMenu = new JMenu("Campuses");
        JMenuItem mainCampus = new JMenuItem("Main Campus");
        JMenuItem satelliteCampus = new JMenuItem("Satellite Campus");

        mainCampus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JavaJuniorCollege.this, "Main Campus: Located in downtown Java City.");
            }
        });

        satelliteCampus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JavaJuniorCollege.this, "Satellite Campus: Located in the suburbs of Java City.");
            }
        });

        campusesMenu.add(mainCampus);
        campusesMenu.add(satelliteCampus);

        // Create the "Majors" menu
        JMenu majorsMenu = new JMenu("Majors");
        JMenuItem computerScience = new JMenuItem("Computer Science");
        JMenuItem businessAdministration = new JMenuItem("Business Administration");

        computerScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JavaJuniorCollege.this, "Computer Science: Offers courses in programming, data structures, algorithms, and more.");
            }
        });

        businessAdministration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JavaJuniorCollege.this, "Business Administration: Offers courses in management, finance, marketing, and more.");
            }
        });

        majorsMenu.add(computerScience);
        majorsMenu.add(businessAdministration);

        // Create the "Activities" menu
        JMenu activitiesMenu = new JMenu("Activities");
        JMenuItem codingClub = new JMenuItem("Coding Club");
        JMenuItem sports = new JMenuItem("Sports");

        codingClub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JavaJuniorCollege.this, "Coding Club: Join the club to enhance your programming skills through projects and competitions.");
            }
        });

        sports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JavaJuniorCollege.this, "Sports: Participate in various sports activities including soccer, basketball, and more.");
            }
        });

        activitiesMenu.add(codingClub);
        activitiesMenu.add(sports);

        // Add menus to the menu bar
        menuBar.add(campusesMenu);
        menuBar.add(majorsMenu);
        menuBar.add(activitiesMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        JavaJuniorCollege app = new JavaJuniorCollege();
        app.setVisible(true);
    }
}
