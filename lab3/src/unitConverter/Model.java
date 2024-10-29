package unitConverter;

import java.util.Scanner;

public class Model {

    Scanner sc = new Scanner(System.in);

    double setPound(){
        System.out.println("Enter weight in pounds: ");
        double set_lbs = sc.nextDouble();
        sc.close();
        return set_lbs;
    }

    double getPound(double lbs){
        return lbs;
    }

    double toKilogram(double lbs){
        return lbs/2.205;
    }
}
