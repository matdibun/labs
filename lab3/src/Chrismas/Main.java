package Chrismas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Controller c =  new Controller();
        View v = new View();
        Model m = new Model();

        c.getCountDown(m, v);
    }
}