import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarNight {
    public static void mainDraw(Graphics graphics) {
        //Call main method StarNight
        StarNight(70, 0, graphics);

    }

    // method StarNight creating StarNight sky
    public static void StarNight(int size, int starSize, Graphics graphics) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //setting size of star from random number
                //we must use help variable cause we want call this method only once
                starSize = randomStarSize();
                // creating black square background for stars
                graphics.setColor(Color.BLACK);
                graphics.fillRect(i * size, j * size, size, size);
                //creating stars with random color and size inside square
                graphics.setColor(randomColor());
                graphics.fillOval(i * size, j * size, starSize, starSize);
            }
            //System.out.println(randomColor());
            //System.out.println(randomStarSize());
        }
    }

    // method randomColor returning random RGB color
    public static Color randomColor() {
        float randomColor1 = (float) Math.random(); //here we are getting float number between 0.0 and 1
        float randomColor2 = (float) Math.random();
        float randomColor3 = (float) Math.random();
        float randomColor4 = (float) Math.random();
        // new Color convert random number to RGB parameter and returns this value [r=105,g=65,b=253]
        return new Color(randomColor1, randomColor2, randomColor3, randomColor4);
    }

    //method randomStarSize return int number for setting star size
    public static int randomStarSize() {
        Random starSize = new Random();
        // this reruns random integer number between 1 and 50
        //max is set to 50 and it is exclusive value min is 1 and it is inclusive value
        return starSize.ints(1, 50).findFirst().getAsInt();
    }

    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("StarNight");
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