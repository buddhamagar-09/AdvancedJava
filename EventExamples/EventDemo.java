import javax.swing.*;
import java.awt.event.*;

class EventDemo implements ActionListener {

    JFrame f;
    JButton btn;
    JLabel l1;

    public EventDemo() {
        f = new JFrame("Event Application");
        l1 = new JLabel();

        btn = new JButton("click me");

        f.add(l1);
        f.add(btn);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        l1.setText("Button was Clicked");
        // System.out.println("Button was clicked");
    }

    public static void main(String[] args) {
        new EventDemo();

    }
}