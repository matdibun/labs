package Chrismas;

import java.time.LocalDate;
import java.time.Period;

public class Model {
    public Period countDowntoXmas(){
        LocalDate today = LocalDate.now();
        LocalDate Xmas = LocalDate.of(today.getYear(), 12,25);
        return Period.between(today,Xmas);
    }
}
