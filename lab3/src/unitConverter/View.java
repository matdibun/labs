package unitConverter;


import javax.swing.*;

public class View {

    void showResult(double lbs, double kg){
        String message = String.format("%.2f lbs is %.2f kg", lbs, kg);
        JOptionPane.showMessageDialog(null, message);
    }
}
