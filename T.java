import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class T implements MouseListener {

    JButton button;
    JLabel l1, l2, result;
    JTextField t1, t2;

    // Constructor
    public T() {
        JFrame frame = new JFrame("MouseListener Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        button = new JButton("Click Me");
        button.setBounds(130, 70, 120, 40);

        t1 = new JTextField();
        t1.setBounds(50, 20, 100, 30);
        t2 = new JTextField();
        t2.setBounds(200, 20, 100, 30);

        l1 = new JLabel("Enter first number:");
        l1.setBounds(50, 0, 150, 20);
        l2 = new JLabel("Enter second number:");
        l2.setBounds(200, 0, 150, 20);

        result = new JLabel("Result will be shown here");
        result.setBounds(50, 120, 300, 30);

        button.addMouseListener(this); // add MouseListener
        frame.add(t1);
        frame.add(t2);
        frame.add(l1);
        frame.add(l2);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int smaller = Math.min(num1, num2);

        result.setText("Smaller Number: " + smaller);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int greater = Math.max(num1, num2);

        result.setText("Greater Number: " + greater);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new T();
    }
}
