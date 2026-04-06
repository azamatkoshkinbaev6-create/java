package JavaApplet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pernetaqta extends JPanel {
    private String key = "";

    public pernetaqta() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                key = "Басылды: " + e.getKeyChar();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString(key, 100, 150);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Key Event");
        f.add(new pernetaqta());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}