import javax.swing.*;
// import java.awt.*;

/**
 * ImageDemo
 */
public class ImageDemo {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Image Displaying");
        ImageIcon image = new ImageIcon("cat2.gif");
        JLabel label = new JLabel(image);
        jf.add(label);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    } 
}