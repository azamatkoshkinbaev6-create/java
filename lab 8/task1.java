package MyGraph;

import javax.swing.*;
import java.awt.*;

public class task1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Антиалиасинг (сызықтар тегіс көрінуі үшін)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        // Координаталық осьтерді сызу
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, centerY, width, centerY); // X осі
        g2.drawLine(centerX, 0, centerX, height); // Y осі

        // y = kx графиктерін сызу
        g2.setColor(Color.BLUE);
        int scale = 100; // Масштаб (1 бірлік = 100 пиксель)

        for (double k = 0.1; k <= 1; k += 0.1) {
            // Екі нүктені анықтаймыз: x1 = -2, x2 = 2
            double x1 = -width / 2.0;
            double y1 = k * x1;

            double x2 = width / 2.0;
            double y2 = k * x2;

            // Экран координаталарына көшіру
            // (Ескерту: Компьютерде Y осі төмен қарай бағытталған, сондықтан азайтамыз)
            int screenX1 = (int) (centerX + x1);
            int screenY1 = (int) (centerY - y1);
            int screenX2 = (int) (centerX + x2);
            int screenY2 = (int) (centerY - y2);

            g2.drawLine(screenX1, screenY1, screenX2, screenY2);

            // k мәнін графиктің жанына жазу (тек оң жақта)
            g2.drawString(String.format("k=%.1f", k), screenX2 - 50, screenY2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("y = kx графигі");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new task1());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}