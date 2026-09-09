import javax.swing.*;
import java.awt.*;

public class GraphicsDemo2 extends JPanel {

    @Override 
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;


       g2.setFont(new Font("Arial",Font.PLAIN,20));
       g2.drawString("Hello World 1 !",50,50);
       
       g2.setFont(new Font("Serif",Font.BOLD,20));
       g2.drawString("Hello World 2 !",80,80);

       g2.setFont(new Font("SanSerif",Font.ITALIC,20));
       g2.drawString("Hello World 3 !",100,100);

       g2.setFont(new Font("Monospaced",Font.BOLD | Font.ITALIC,20));
       g2.drawString("Hello World 4 !",110,120);
  
       
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Messages");
        // GraphicsDemo2 panel = new GraphicsDemo2();

        // panel.setBackground(Color.BLUE);

        frame.add(new GraphicsDemo2());

        // frame.add(panel);

        frame.setSize(500,500);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        

       

    }
}
