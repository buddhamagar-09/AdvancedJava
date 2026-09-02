import javax.swing.*;

public class SwingDemo{
    public static void main(String[]args)
    {
        JFrame  frame = new JFrame("My Swing Application");
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);
        frame.setSize(400, 200);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}