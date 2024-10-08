package temperature;

public class Controller {
    void control(Model m, View v) {
        double c = m.getTemperature();
        double f = m.toFahrenheit(c);
        v.temperature(c ,f );
    }
}
