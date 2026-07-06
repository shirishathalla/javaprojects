package ui;

import javax.swing.*;
import java.awt.*;

public class AddProblemFrame extends JFrame {

    public AddProblemFrame() {

        setTitle("Add Problem");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5,2));

        panel.add(new JLabel("Problem Name"));
        JTextField problem = new JTextField();
        panel.add(problem);

        panel.add(new JLabel("Topic"));
        JTextField topic = new JTextField();
        panel.add(topic);

        panel.add(new JLabel("Difficulty"));
        String[] levels = {"Easy","Medium","Hard"};
        JComboBox<String> difficulty = new JComboBox<>(levels);
        panel.add(difficulty);

        JButton save = new JButton("Save");
        panel.add(save);

        save.addActionListener(e -> {

    String p = problem.getText();
    String t = topic.getText();
    String d = difficulty.getSelectedItem().toString();

    JOptionPane.showMessageDialog(
            this,
            "Problem Saved!\n\n"
            + "Problem : " + p
            + "\nTopic : " + t
            + "\nDifficulty : " + d
    );

    problem.setText("");
    topic.setText("");
});

        add(panel, BorderLayout.CENTER);

        setVisible(true);   
    }
}