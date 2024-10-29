import javax.swing.*;
import java.awt.*;

class CustomPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Custom drawing code
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);  // Draws a red rectangle
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CustomPanel panel = new CustomPanel();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
