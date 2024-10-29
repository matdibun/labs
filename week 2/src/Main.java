import javax.swing.*;
public class Main{
    public static void main(String[] args) {
//        String input = JOptionPane.showInputDialog(null, "Miles to Kilometer Converter");
//        double miles = Double.parseDouble(input);
//        double kilometers = miles * 1.60934;
//        String message = String.format("%.2f miles is %.2f kilometer.", miles, kilometers);
//        JOptionPane.showMessageDialog(null, message);

        String input = JOptionPane.showInputDialog(null, "Miles to Kilometer Converter");
        double miles = Double.parseDouble(input);
        double kilometers = miles * 1.60934;
        String message = String.format("%.2f miles is %.2f kilometer.", miles, kilometers);
        JOptionPane.showMessageDialog(null, message);
    }
}