package ui;

import javax.swing.*;
import java.awt.*;

public class ViewProblemsFrame extends JFrame {

    public ViewProblemsFrame() {

        setTitle("View Problems");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea area = new JTextArea();

        area.setText(
                "Two Sum | Arrays | Easy\n" +
                "Longest Substring | Strings | Medium\n" +
                "Merge Intervals | Arrays | Medium"
        );

        area.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(area);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}