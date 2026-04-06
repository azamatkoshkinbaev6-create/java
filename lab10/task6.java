package JavaApplet;

import javax.swing.*;
import java.awt.*;

public class koordinata extends JPanel {
    private int x = 0, y = 0;

    public koordinata() {
        JTextField tx = new JTextField(3);
        JTextField ty = new JTextField(3);
        JButton btn = new JButton("Салу");

        btn.addActionListener(e -> {
            x = Integer.parseInt(tx.getText());
            y = Integer.parseInt(ty.getText());
            repaint();
        });

        add(new JLabel("X:")); add(tx);
        add(new JLabel("Y:")); add(ty);
        add(btn);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new koordinata());
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}