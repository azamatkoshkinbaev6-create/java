package JavaApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tyshqan extends JPanel {
    private int px = -10, py = -10;

    public tyshqan() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                px = e.getX();
                py = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(px - 5, py - 5, 10, 10);
        g.drawString("(" + px + "," + py + ")", px + 10, py);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse Click");
        f.add(new tyshqan());
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}