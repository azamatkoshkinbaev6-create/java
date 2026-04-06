package JavaApplet;

import javax.swing.*;
import java.awt.*;

public class calculator extends JFrame {
    public calculator() {
        setLayout(new FlowLayout());
        JTextField f1 = new JTextField(5);
        JTextField f2 = new JTextField(5);
        JButton btn = new JButton("Қосу");
        JLabel res = new JLabel("Результат: ");

        btn.addActionListener(e -> {
            double sum = Double.parseDouble(f1.getText()) + Double.parseDouble(f2.getText());
            res.setText("Результат: " + sum);
        });

        add(f1); add(new JLabel("+")); add(f2); add(btn); add(res);
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) { new calculator(); }
}