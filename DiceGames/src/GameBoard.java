import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    Player player1;
    Player player2;

    public GameBoard(Player p1, Player p2) {
        JFrame frame = new JFrame();
        frame.setTitle("주사위 게임");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setSize(300, 300);
        frame.setVisible(true);
        this.player1 = p1;
        this.player2 = p2;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, 300, 300);
        g.setColor(Color.black);
        if (player1.rolled() != null && player2.rolled() != null) {

            g.drawString(player1.name(), 70, 70);
            g.drawString(player2.name(), 200, 70);
            if (player1.wins()) {
                g.drawString("이겼다!", 70, 110);
            } else if (player2.wins()) {
                g.drawString("이겼다!", 200, 110);
            } else {

                g.drawString("비겼다!", 130, 110);
            }
        }

        g.drawString("" + player1.points(), 70, 90);
        g.drawString("" + player2.points(), 200, 90);
        g.drawString("" + player1.rolled().face1(), 70, 130);
        g.drawString("" + player1.rolled().face2(), 90, 130);
        g.drawString("" + player2.rolled().face1(), 200, 130);
        g.drawString("" + player2.rolled().face2(), 220, 130);
    }
}