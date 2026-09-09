import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JPanel {

    @Override 
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(50,50,200,50);

        g2.drawRect(50,80,150,80);
        // g2.setColor(Color.RED);
        g2.fillRect(250,80,150,80);

       
        g2.drawOval(50,190,150,80);
        g2.setColor(Color.BLUE);
        g2.fillOval(150,180,150,80);

        // g2.setColor(Color.GREEN);
        // g2.drawString("Hello Guys! How are u ?",100,40);
        
        
       
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Shapes");
        GraphicsDemo panel = new GraphicsDemo();
        panel.setBackground(Color.BLUE);
        frame.add(new GraphicsDemo());

        frame.add(panel);

        frame.setSize(500,500);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        

       

    }
}
