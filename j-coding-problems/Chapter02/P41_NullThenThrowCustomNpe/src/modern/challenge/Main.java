package modern.challenge;

import java.awt.Color;
import java.awt.Point;

public class Main {

    public static void main(String[] args) {
        
        // This code will cause a NullPointerException

        NewCar newCar = new NewCar("Mazda", null);
        OldCar oldCar = new OldCar(null, new Color(123, 123, 223));

        newCar.assignDriver(null, new Point(1, 1));
        oldCar.assignDriver("Transport", null);

        // my code will NOT cause a NullPointerException

//        NewCar newCar2 = new NewCar("Mazda", new Color(223,123,123));
//        OldCar oldCar2 = new OldCar("Volvo", new Color(123, 123, 223));
//
//        newCar2.assignDriver("HGV", new Point(1, 1));
//        oldCar2.assignDriver("Transport", new Point(2,2));


    }

}
