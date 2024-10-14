import javax.swing.*;

public class BankReader {
    String inputLine;
    public BankReader() {
        inputLine = "";
    }
    char readCommand(String message){
        inputLine = JOptionPane.showInputDialog(message).trim().toUpperCase();
        return inputLine.charAt(0);
    }

    int readAmount(){
        int amount = 0;
        String s = inputLine.substring(1, inputLine.length());
        s = s.trim();
        if (s.length() > 0){
            amount = Integer.parseInt(s);
        }else
            JOptionPane.showMessageDialog(null, "Invalid amount entered.");
        return amount;
    }
}
