package clock;

public class Control {
    public void control(Model m, View v){
        v.showSwing(m.whatTimeIsIt());
    }
}
