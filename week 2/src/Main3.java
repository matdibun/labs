import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter an integer: ");
        int inputValue = Math.abs(Integer.parseInt(input));

        int ones = inputValue % 10;
        int tens = (inputValue % 100) / 10;
        int hundreds = (inputValue % 1000) / 100;
        int thousands = (inputValue % 10000) / 1000;
        int tenThousands = (inputValue % 100000) / 10000;

        int trueValue = ones + tens + hundreds + thousands + tenThousands;
        boolean truthValue = trueValue == 9 || trueValue == 18 || trueValue == 27;

        String message = String.format("Is %d divisible by 9? %b", inputValue, truthValue);
        JOptionPane.showMessageDialog(null, message);


    }
}
