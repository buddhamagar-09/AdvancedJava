package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author N I T R O
 */
public class MovieAddDemo implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2, b3, b4, b5;

    public MovieAddDemo() {

        // ---------------- FRAME ----------------
        f = new JFrame("Movie Management System");
        f.setSize(650, 500);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        // ---------------- MAIN PANEL ----------------
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245, 247, 250));

        // ---------------- HEADER ----------------
        JPanel header = new JPanel();
        header.setBackground(new Color(30, 58, 95));
        header.setPreferredSize(new Dimension(650, 80));
        header.setLayout(new BorderLayout());

        l1 = new JLabel("MOVIE MANAGEMENT SYSTEM");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        l1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel subtitle = new JLabel("Add New Movie");
        subtitle.setForeground(new Color(220, 230, 240));
        subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel titlePanel = new JPanel(new GridLayout(2, 1));
        titlePanel.setOpaque(false);
        titlePanel.add(l1);
        titlePanel.add(subtitle);

        header.add(titlePanel, BorderLayout.CENTER);

        mainPanel.add(header, BorderLayout.NORTH);

        // ---------------- FORM PANEL ----------------
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 15, 15));
        formPanel.setBackground(Color.WHITE);

        formPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 225, 230)),
                BorderFactory.createEmptyBorder(25, 30, 25, 30)
        ));

        // Labels
        l2 = new JLabel("Movie Name");
        l3 = new JLabel("Category");
        l4 = new JLabel("Publisher");
        l5 = new JLabel("Length");
        l6 = new JLabel("Language");
        l7 = new JLabel("Genre");

        JLabel[] labels = {l2, l3, l4, l5, l6, l7};

        for (JLabel label : labels) {
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(new Color(50, 60, 70));
        }

        // Text fields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();

        JTextField[] fields = {t1, t2, t3, t4, t5, t6};

        for (JTextField field : fields) {
            field.setFont(new Font("Arial", Font.PLAIN, 14));
            field.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 205, 210)),
                    BorderFactory.createEmptyBorder(5, 8, 5, 8)
            ));
        }

        formPanel.add(l2);
        formPanel.add(t1);

        formPanel.add(l3);
        formPanel.add(t2);

        formPanel.add(l4);
        formPanel.add(t3);

        formPanel.add(l5);
        formPanel.add(t4);

        formPanel.add(l6);
        formPanel.add(t5);

        formPanel.add(l7);
        formPanel.add(t6);

        // Center form
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(new Color(245, 247, 250));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(25, 50, 20, 50));

        centerPanel.add(formPanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // ---------------- BUTTON PANEL ----------------
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 15));
        buttonPanel.setBackground(new Color(245, 247, 250));

        b1 = new JButton("Display");
        b2 = new JButton("Delete");
        b3 = new JButton("Edit");
        b4 = new JButton("Reset");
        b5 = new JButton("Submit");

        JButton[] buttons = {b1, b2, b3, b4, b5};

        for (JButton button : buttons) {
            button.setFont(new Font("Arial", Font.BOLD, 13));
            button.setFocusPainted(false);
            button.setPreferredSize(new Dimension(95, 35));
        }

        // Button colors
        b1.setBackground(new Color(52, 152, 219));
        b1.setForeground(Color.WHITE);

        b2.setBackground(new Color(231, 76, 60));
        b2.setForeground(Color.WHITE);

        b3.setBackground(new Color(243, 156, 18));
        b3.setForeground(Color.WHITE);

        b4.setBackground(new Color(127, 140, 141));
        b4.setForeground(Color.WHITE);

        b5.setBackground(new Color(39, 174, 96));
        b5.setForeground(Color.WHITE);

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
        buttonPanel.add(b5);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // ---------------- ACTION LISTENERS ----------------
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        // ---------------- SHOW FRAME ----------------
        f.setContentPane(mainPanel);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            JOptionPane.showMessageDialog(
                    f,
                    "Logic is yet to build."
            );

        } else if (e.getSource() == b2) {

            JOptionPane.showMessageDialog(
                    f,
                    "Logic is yet to build."
            );

        } else if (e.getSource() == b3) {

            JOptionPane.showMessageDialog(
                    f,
                    "Logic is yet to build."
            );

        } else if (e.getSource() == b4) {

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");

        } else if (e.getSource() == b5) {

            String mname = t1.getText().trim();
            String category = t2.getText().trim();
            String publisher = t3.getText().trim();
            String length = t4.getText().trim();
            String language = t5.getText().trim();
            String genre = t6.getText().trim();

            if (mname.isEmpty() ||
                category.isEmpty() ||
                publisher.isEmpty() ||
                length.isEmpty() ||
                language.isEmpty() ||
                genre.isEmpty()) {

                JOptionPane.showMessageDialog(
                        f,
                        "Please fill up all the fields."
                );

                return;
            }

            try {

            } catch (Exception ee) {

                JOptionPane.showMessageDialog(
                        f,
                        "Enter a valid length."
                );

                return;
            }

            Connection con = null;
            PreparedStatement pst = null;

            try {

                String url = "jdbc:mysql://localhost:3306/java_bca3";
                String un = "root";
                String pw = "";

                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(url, un, pw);

                String sql =
                        "INSERT INTO MovieInfo " +
                        "(Mname, Category, Publisher, Length, Language, Genre) " +
                        "VALUES (?, ?, ?, ?, ?, ?)";

                pst = con.prepareStatement(sql);

                pst.setString(1, mname);
                pst.setString(2, category);
                pst.setString(3, publisher);
                pst.setString(4, length);
                pst.setString(5, language);
                pst.setString(6, genre);

                int result = pst.executeUpdate();

                if (result == 1) {

                    JOptionPane.showMessageDialog(
                            f,
                            "Movie inserted successfully."
                    );

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                }

            } catch (Exception se) {

                JOptionPane.showMessageDialog(
                        f,
                        "Error occurred: " + se.getMessage()
                );

            } finally {

                try {

                    if (pst != null) {
                        pst.close();
                    }

                    if (con != null) {
                        con.close();
                    }

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(
                            f,
                            ex.getMessage()
                    );
                }
            }
        }
    }

    public static void main(String[] args) {
        new MovieAddDemo();
    }
}

