import javax.swing.*;
import java.awt.*;

public class BankWriter extends JPanel {
    private int WIDTH = 300;
    private int HEIGHT = 200;
    private BankAccount bank;
    private String lastTransaction = "";

    public BankWriter(String title, BankAccount b) {
        bank = b;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle(title);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT+22);
        g.setColor(Color.black);
        int textMargin = 50;
        int textBaseLine = 50;
        g.drawString(lastTransaction, textMargin, textBaseLine);
        g.drawString("Balace = " + bank.getBalance() + "won", textMargin, textBaseLine);

    }

    public void showTransaction(int amount, String message) {
        lastTransaction = amount + "won" + message;
        this.repaint();
    }

    public void showTransaction(String message) {
        lastTransaction = message;
        this.repaint();
    }
}
