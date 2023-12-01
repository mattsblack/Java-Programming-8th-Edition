package JMovieFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame {


    public JMovieFrame() {
        // Create the buttons for each region
        JButton northButton = new JButton("North by Northwest");
        JButton southButton = new JButton("Gone with the Wind");
        JButton eastButton = new JButton("East of Eden");
        JButton westButton = new JButton("True West");
        JButton centerButton = new JButton("The Heart of the Matter");

        // Set the layout manager
        setLayout(new BorderLayout());

        // Add the buttons to the frame
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);

        //add ActionListener to each button
        northButton.addActionListener(new ButtonActionListener());
        southButton.addActionListener(new ButtonActionListener());
        eastButton.addActionListener(new ButtonActionListener());
        westButton.addActionListener(new ButtonActionListener());
        centerButton.addActionListener(new ButtonActionListener());
    }

    private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String movie = button.getText();
            String year = "";
            String star = "";

            // Set the year and star based on the movie
            if (movie.equals("North by Northwest")) {
                year = "1959";
                star = "Cary Grant";
            } else if (movie.equals("Gone with the Wind")) {
                year = "1939";
                star = "Clark Gable";
            } else if (movie.equals("East of Eden")) {
                year = "1955";
                star = "James Dean";
            } else if (movie.equals("True West")) {
                year = "1984";
                star = "Sam Shepard";
            } else if (movie.equals("The Heart of the Matter")) {
                year = "1953";
                star = "Trevor Howard";
            }

            //show movie details
            JOptionPane.showMessageDialog(JMovieFrame.this,
            "Year of Release: " + year + "\nStar: " + star,
            "Movie Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JMovieFrame frame = new JMovieFrame();
            frame.setTitle("JMovieFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
