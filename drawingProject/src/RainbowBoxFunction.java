import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class RainbowBoxFunction {public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

    ArrayList<String> hColors = new ArrayList<String>(Arrays.asList("#FF0000", "#E69138", "#FFFF00", "#00FF00", "#0000FF", "#073763", "#EE82EE"));
    int size = 0;
    int size2 = 320;
    for (int i = 0; i <= 6; i++, size += 20, size2 -= 40) {
        String heColors = hColors.get(i);
        graphics.setColor(Color.decode(heColors));
        graphics.fillRect((size), (size) , size2, size2 );
    }
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
