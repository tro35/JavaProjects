import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        Color purple = Color.decode("#800080");
        int a = 10;     
        int b = 10;
        

    for (int i = 0; i <= 3; i++, a += a , b += b) {        
        graphics.setColor(purple);
        graphics.fillRect(a , a , b , b ); 
                   
    }
    /*
        graphics.setColor(purple);
        graphics.fillRect(10, 10, 10, 10);
        graphics.setColor(purple);
        graphics.fillRect(20, 20, 20, 20);
        graphics.setColor(purple);
        graphics.fillRect(40, 40, 40, 40);
        graphics.setColor(purple);
        graphics.fillRect(80, 80, 80, 80);*/
        
 


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
    

