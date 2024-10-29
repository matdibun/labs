import javax.swing.*;
public class Main2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter number between -99999 and 99999");
        int inputValue = Integer.parseInt(input);
        boolean divisiblBy9 = inputValue % 9 == 0;
        String message = String.format("Is %.2f divisible by 9? %b", inputValue, divisiblBy9);
        JOptionPane.showMessageDialog(null, message);

    }
}
