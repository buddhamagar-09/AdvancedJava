import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    TextField textField;
    MyFrame(){
        //create textfield
        textField = new TextField();

        add(textField);
        setSize(400,300);
        setTitle("Adapter class example");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.out.println("window is closing");
                System.exit(0);
            }
            
        });

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked at:"+e.getX()+","+e.getY());
            }
        });
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                System.out.println("key pressed:"+e.getKeyChar());
            }
        });
    }
    public static void main(String[] args){
        new MyFrame();
    }
}