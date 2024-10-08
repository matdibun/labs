package clock;

public class Main {
    public static void main(String[] args) {
        Model m = new Model();
        Control c = new Control();
        View v = new View();
        c.control(m,v);
    }
}
