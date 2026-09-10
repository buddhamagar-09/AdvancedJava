import javax.swing.*;
import java.awt.*;

public class ImageDemo2 extends JLabel {
    Image image;

    public ImageDemo2() {
        image = new ImageIcon("cat2.gif").getImage();
        {

        };

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image, 50, 50,500,500, this);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.add(new ImageDemo2());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
