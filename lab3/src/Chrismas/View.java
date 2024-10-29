package Chrismas;

import javax.swing.*;
import java.time.*;

public class View {
    void showCountDown(Period p){
        int months = p.getMonths();
        int days = p.getDays();
        String message = "There are " + months + " months and " +
                days + " days left until Xmas";
        JOptionPane.showMessageDialog(null, message);

    }
}
