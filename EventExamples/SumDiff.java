import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDiff implements ActionListener {

    JFrame f;
    JLabel l1, l2, sum, diff, error;
    JTextField t1, t2;
    JButton b1;

    public SumDiff() {
        f = new JFrame("Simple Application");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter first Number:");
        l2 = new JLabel("Enter second Number:");
        sum = new JLabel("Sum: ");
        diff = new JLabel("Difference: ");
        error = new JLabel("");

        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        b1 = new JButton("Calculate");
        b1.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(sum);
        f.add(diff);
        f.add(error);

        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText().trim());
            int num2 = Integer.parseInt(t2.getText().trim());

            int s = num1 + num2;
            int d = num1 - num2;

            sum.setText("Sum: " + s);
            diff.setText("Difference: " + d);
            error.setText(""); // clear any previous error

        } catch (NumberFormatException ex) {
            error.setText("Please enter valid integers!");
            sum.setText("Sum: ");
            diff.setText("Difference: ");
        }
    }

    public static void main(String[] args) {
        new SumDiff();
    }
}
