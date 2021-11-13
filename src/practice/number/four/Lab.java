package practice.number.four;

import javax.swing.*;
import java.awt.*;

public class Lab extends JFrame {
    int milanScore = 0;
    int madridScore = 0;
    String lastScorer = "N/A";
    String winner = "Draw";


    public Lab() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel panel = new JPanel();

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel gameScoreL = new JLabel(milanScore + " X " + madridScore);
        JLabel lastScorerL = new JLabel("Last scorer: " + lastScorer);
        JLabel winnerL = new JLabel("Winner: " + winner);

        button1.addActionListener(e -> {
            milanScore++;
            lastScorer = "AC Milan";
            panel.updateUI();
        });

        button2.addActionListener(e -> {
            madridScore++;
            lastScorer = "Real Madrid";
            panel.updateUI();
        });

        panel.add(gameScoreL, BorderLayout.NORTH);
        panel.add(lastScorerL, BorderLayout.SOUTH);
        panel.add(button1, BorderLayout.WEST);
        panel.add(button2, BorderLayout.EAST);
        panel.add(winnerL, BorderLayout.CENTER);

        container.add(panel);

        setTitle("Football match");
        setPreferredSize(new Dimension(800, 100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400,300);
        setVisible(true);
        pack();
    }
}
