import javax.swing.*;

public class TextArea {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Java Application");
        JTextArea textarea = new JTextArea();
        textarea.setText("Javaswing\n" +
                "GUI Programming\n" +
                "BCA 2080");
        jf.add(textarea);
        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
