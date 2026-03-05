package JavaApplet;

import javax.swing.*;
import java.awt.*;

public class animation extends JPanel {
    private int x = 0;

    public animation() {
        Timer timer = new Timer(10, e -> {
            x++;
            if (x > getWidth()) x = -50;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Animation");
        f.add(new animation());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}