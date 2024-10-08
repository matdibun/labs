//TODO: make the egg grow
//PROBLEM:  1. just display the end result (white screen for i*Thread.sleep(n) second)
//          2. ...

import java.awt.*;
import javax.swing.*;

public class GrowingEgg extends JPanel {

    private final int NET_SIZE;
    private int egg_width;
    private int egg_height;
    private int x;
    private int y;

    public GrowingEgg(int frame_size) {
        NET_SIZE = frame_size;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Growing Egg");
        frame.setSize(NET_SIZE, NET_SIZE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, NET_SIZE, NET_SIZE);
        g.setColor(Color.YELLOW);

//        for (int i = 0; i < 6; i++) {
//            try {
//                Thread.sleep(500);  // Pause for half a second between each iteration
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//
//            int ratio = NET_SIZE * i / 400;
//
//            egg_width = ratio * 60;
//            egg_height = ratio * 40;
//
//            x = (NET_SIZE - egg_width) / 2;
//            y = (NET_SIZE - egg_height) / 2;
//
//            g.fillOval(x, y, egg_width, egg_height);
//        }

        int ratio = NET_SIZE / 400;

        egg_width = ratio * 60;
        egg_height = ratio * 40;

        x = (NET_SIZE - egg_width) / 2;
        y = (NET_SIZE - egg_height) / 2;

        g.fillOval(x, y, egg_width, egg_height);

    }

    public static void main (String[]args){
        
        new GrowingEgg(1000);
    }
}