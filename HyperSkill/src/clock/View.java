package clock;

import javax.swing.*;
import java.time.LocalTime;

public class View {
    public void showSwing(LocalTime t){
        JOptionPane.showMessageDialog(null, t);
    }
}
