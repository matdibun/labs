import javax.swing.*;

public class Registar {

    public String invitePlayer() {
        return JOptionPane.showInputDialog("Enter name.");
    }

    public int wantToContinue() {
        return JOptionPane.showConfirmDialog(null, "Play again");
    }
}