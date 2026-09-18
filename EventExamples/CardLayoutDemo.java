import java.awt.*;
import javax.swing.*;


public class CardLayoutDemo extends JFrame {
    public CardLayoutDemo() {
        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);

        add(new JButton("Page 1"), "First Page");
        add(new JButton("Page 2"), "Second Page");
        add(new JButton("Page 3"), "Third Page");

        cardLayout.show(getContentPane(), "First Page");
        cardLayout.show(getContentPane(), "Second Page");
        cardLayout.show(getContentPane(), "Third Page");

        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
    
}
