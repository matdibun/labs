import javax.swing.*;

public class Dealer {
    public void dealDiceGame(Player p1, Player p2, GameBoard b, Registar r) {
        while (true) {

            if (p1.points() > p2.points()) {
                p2.play(new Dice());
                p1.play(new Dice());
            } else {
                p1.play(new Dice());
                p2.play(new Dice());
            }


            if (p1.rolled().sum() == p2.rolled().sum() && p1.rolled().face1() == p2.rolled().face1() && p1.rolled().face2() == p2.rolled().face2()) {

                p1.reset();
                p2.reset();
                continue;
            }

            // Determine the winner based on dice results
            if (p1.rolled().twin() && !p2.rolled().twin()) {
                p1.receivePoint();
            } else if (!p1.rolled().twin() && p2.rolled().twin()) {
                p2.receivePoint();
            } else if (p1.rolled().twin() && p2.rolled().twin()) {
                if (p1.rolled().face1() > p2.rolled().face1()) {
                    p1.receivePoint();
                } else {
                    p2.receivePoint();
                }
            } else if (p1.rolled().sum() > p2.rolled().sum()) {
                p1.receivePoint();
            } else if (p1.rolled().sum() < p2.rolled().sum()) {
                p2.receivePoint();
            } else if (p1.rolled().difference() < p2.rolled().difference()) {
                p1.receivePoint();
            } else if (p1.rolled().difference() > p2.rolled().difference()) {
                p2.receivePoint();
            }

            // Repaint the game board
            b.repaint();

            // Ask if the player wants to continue the game
            if (r.wantToContinue() != JOptionPane.YES_OPTION) {
                System.exit(0);
            }

            // Reset players for the next round
            p1.reset();
            p2.reset();
        }
    }
}