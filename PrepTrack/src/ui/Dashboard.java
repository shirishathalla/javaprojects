package ui;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("PrepTrack Dashboard");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("PrepTrack");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));

        JButton addButton = new JButton("Add Problem");
        JButton viewButton = new JButton("View Problems");
        JButton exitButton = new JButton("Exit");

        JPanel panel = new JPanel();

        panel.add(addButton);
        panel.add(viewButton);
        panel.add(exitButton);

        add(title, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        addButton.addActionListener(e -> new AddProblemFrame());

        viewButton.addActionListener(e -> new ViewProblemsFrame());

        exitButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}