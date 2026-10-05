import java.awt.*;
import javax.swing.*;

public class GridBagDemo extends JFrame {

    public GridBagDemo() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // row 0 -- Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JTextField(15), gbc);

        // address -- row1
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Address"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new JTextField(15), gbc);

        //checkbox -- row2
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Hobbies"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(new JCheckBox("Playing"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(new JCheckBox("Swimming"), gbc);

        //dropdown -- row3
        String[] courses = {"BCA", "CSIT", "BIM", "BBS"};
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Course"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(new JComboBox<>(courses), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JButton("submit"), gbc);

        setTitle("GridBagLayout Form");
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GridBagDemo();
    }
}