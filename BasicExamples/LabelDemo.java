import javax.swing.*;

public class LabelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information");
        JLabel label = new JLabel("Welcome to Java Swing!");
        frame.add(label);
        frame.setSize(500, 300);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}