package JavaApplet;

import javax.swing.*;
import java.awt.*;

public class tuster extends JPanel {
    private Color color = Color.RED;

    public tuster() {
        JButton btn = new JButton("Түсті өзгерт");
        btn.addActionListener(e -> {
            if (color == Color.RED) color = Color.GREEN;
            else if (color == Color.GREEN) color = Color.BLUE;
            else color = Color.RED;
            repaint();
        });
        add(btn);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tuster());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}