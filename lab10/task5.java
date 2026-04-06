package JavaApplet;
import javax.swing.*;
import java.awt.*;

public class figura extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Фонды тазалау

        // Тіктөртбұрыш
        g.drawRect(50, 50, 100, 60);
        g.drawString("Тіктөртбұрыш", 50, 45);

        // Шеңбер
        g.drawOval(200, 50, 80, 80);
        g.drawString("Шеңбер", 200, 45);

        // Сызық
        g.drawLine(50, 170, 300, 170);
        g.drawString("Сызық", 50, 190);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуралар салу");
        frame.add(new figura());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}