import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    
    
    for (int i = 0; i <= 320; i+=20 ) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(i, 0, 160, 160);        
      }

      for (int i = 0; i <= 320; i+=20 ) {
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(320, i, 160, 160);        
      }

      for (int i = 0; i <= 320; i+=20 ) {
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(160, 160, 0, i);
    }   
        
    for (int i = 0; i <= 320; i+=20 ) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(i, 320, 160, 160);
    }
      
  
      
  
        /*  graphics.setColor(Color.RED);
          graphics.drawLine(0, 0, 160, 160);
          graphics.setColor(Color.BLUE);
          graphics.drawLine(160, 0, 160, 160);
          graphics.setColor(Color.ORANGE);
          graphics.drawLine(320, 0, 160, 160);
          graphics.setColor(Color.YELLOW);
          graphics.drawLine(320, 160, 160, 160);
          graphics.setColor(Color.MAGENTA);
          graphics.drawLine(320, 320, 160, 160);
          graphics.setColor(Color.PINK);
          graphics.drawLine(160, 320, 160, 160);
          graphics.setColor(Color.BLACK);
          graphics.drawLine(0, 320, 160, 160);
          graphics.setColor(Color.GREEN);
          graphics.drawLine(0, 160, 160, 160);*/



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