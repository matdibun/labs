package LocalTime;

import java.time.LocalTime;

public class Controller {
    void control(Model m, View v){
        LocalTime currentTime = m.whatTimeIsIt();
        v.show(currentTime);
        v.showSwing(currentTime);
    }
}
