package temperature;

public class Main {
    public static void main(String[] args) {
        Model m = new Model();
        Controller c = new Controller();
        View v = new View();

        c.control(m, v);
    }
}
