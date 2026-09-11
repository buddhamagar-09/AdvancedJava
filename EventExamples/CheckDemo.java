import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckDemo implements ActionListener {

    JFrame f;
    JLabel l1, l2, result;
    JTextField t1, t2;
    JButton b1;

    public CheckDemo() {
        f = new JFrame("Simple Application");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter first Number:");
        l2 = new JLabel("Enter second Number:");
        result = new JLabel("");

        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        b1 = new JButton("Check");
        b1.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(result);

        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText().trim());
            int num2 = Integer.parseInt(t2.getText().trim());

            if (num1 == num2) {
                result.setText("Both numbers are EQUAL");
            } else if (num1 > num2) {
                result.setText(num1 + " is GREATER than " + num2);
            } else {
                result.setText(num2 + " is GREATER than " + num1);
            }
        } catch (NumberFormatException ex) {
            result.setText("Please enter valid integers!");
        }
    }

    public static void main(String[] args) {
        new CheckDemo();
    }
}