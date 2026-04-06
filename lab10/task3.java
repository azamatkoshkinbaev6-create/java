package JavaApplet;
import javax.swing.*;
import java.awt.*;
public class batyrma extends JFrame {
    private JLabel label;

    public batyrma() {
        setTitle("Батырмамен жұмыс");
        setLayout(new FlowLayout());

        label = new JLabel(" ");
        JButton btn = new JButton("Бас мені");

        btn.addActionListener(e -> label.setText("Hello Java"));

        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) { new batyrma(); }
}