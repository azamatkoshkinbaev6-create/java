package JavaApplet;

import javax.swing.*;
import java.awt.*;

public class tandau extends JFrame {
    public tandau() {
        setLayout(new FlowLayout());
        JRadioButton r = new JRadioButton("Red");
        JRadioButton g = new JRadioButton("Green");
        JRadioButton b = new JRadioButton("Blue");
        ButtonGroup group = new ButtonGroup(); // Біреуін ғана таңдау үшін
        group.add(r); group.add(g); group.add(b);

        JPanel draw = new JPanel() {
            @Override
            protected void paintComponent(Graphics graph) {
                super.paintComponent(graph);
                if (r.isSelected()) graph.setColor(Color.RED);
                else if (g.isSelected()) graph.setColor(Color.GREEN);
                else if (b.isSelected()) graph.setColor(Color.BLUE);
                graph.fillOval(20, 10, 80, 80);
            }
        };
        draw.setPreferredSize(new Dimension(150, 120));

        r.addActionListener(e -> draw.repaint());
        g.addActionListener(e -> draw.repaint());
        b.addActionListener(e -> draw.repaint());

        add(r); add(g); add(b); add(draw);
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) { new tandau(); }
}