package unitConverter;

public class Controller {
    void control(Model m, View v){
        double set_lbs = m.setPound();
        double lbs = m.getPound(set_lbs);
        double kg = m.toKilogram(lbs);
        v.showResult(lbs, kg);
    }
}
