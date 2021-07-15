import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        /*int[] coordinates = {10, 10, 290, 10, 290, 290, 10, 290, 290, 290, 290, 10, 10, 10, 10, 290,
                50, 100, 70, 70, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100, 70, 70, 100, 70};
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        for (int i = 0; i <= 8; i++, a += 4, b += 4, c += 4, d += 4) {
            int x = coordinates[a];
            int y = coordinates[b];
            int x1 = coordinates[c];
            int x2 = coordinates[d];
            graphics.setColor(Color.green);
            graphics.drawLine(x, y, x1, x2);
        }
        graphics.setColor(Color.black);
        graphics.drawLine(67, 73, 100, 97);*/
        int [][] x = {
                {10,290,290,10},
                {50,70,80,90,100,120,85,50},
                {67,73,77,73},
                {93,99,103,99},
                {80,82,84,86,88,90,92}
        };
        int [][] y = {
                {10,10,290,290},
                {100,70,90,90,70,100,130,100},
                {100,97,100,103},
                {100,97,100,103},
                {115,116,117,118,117,116,115}
        };
        for (int i = 0; i <x.length; i++) {
            connectPoints(x[i],y[i], graphics);
        }
    }

    public static void connectPoints(int[]x,int[]y,Graphics graphics){
        int n = y.length;
        graphics.setColor(new Color(48,159,8));
        graphics.drawPolygon(x,y,n);
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
