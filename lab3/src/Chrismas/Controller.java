package Chrismas;

import java.time.Period;

public class Controller {
    void getCountDown(Model m, View v){
        Period p = m.countDowntoXmas();
        v.showCountDown(p);
    }
}
