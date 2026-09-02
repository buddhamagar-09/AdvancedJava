import javax.swing.*;

public class FrameDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame("My first Frame");
        f.setSize(500, 500);
        f.setLocation(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
