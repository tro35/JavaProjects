
import javax.swing.*;



import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkertable {
    public static void mainDraw(Graphics graphics) {
        
        Color black = Color.decode("#000000");

        int size = 50;
        
        int a = 2;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) 
                if((j + i) % a == 0){
                graphics.setColor(black);
                graphics.fillRect(i * size, j * size , size, size);
                }            
              
        }


    }



    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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
