package JavaApplet;

import javax.swing.*;
import java.awt.*;

public class engizuorisi extends JFrame {
    public engizuorisi() {
        setTitle("Сәлемдесу");
        setLayout(new FlowLayout());

        JTextField nameField = new JTextField(15);
        JButton btn = new JButton("Айту");
        JLabel result = new JLabel("");

        btn.addActionListener(e -> result.setText("Сәлем, " + nameField.getText()));

        add(new JLabel("Атыңыз:"));
        add(nameField);
        add(btn);
        add(result);

        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) { new engizuorisi(); }
}