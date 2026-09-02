import javax.swing.*;


public class LabelDemo2 {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("Student Informaion.");
        JLabel name = new JLabel("Name: Buddha");
        JLabel age = new JLabel("age: older than u think");
        JLabel faculty = new JLabel("Faculty: BCA");

        frame.setSize(500,500);
        frame.add(name);
        frame.add(age);
        frame.add(faculty);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
