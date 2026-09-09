import javax.swing.*;
import java.awt.*;

public class FrameDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame("My first Frame");
        JLabel label = new JLabel("Hello");
        label.setText("How are you ?");
        label.setFont(new Font("Zapfino",Font.PLAIN,20));
        label.setForeground(java.awt.Color.BLUE);

        f.add(label);
        f.setSize(500, 250);
        // f.setLocation(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
