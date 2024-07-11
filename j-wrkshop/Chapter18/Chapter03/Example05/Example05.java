class Computer05 {
    // variables
    private double cpuSpeed;  // in GHz

    // constructor
    Computer05() {
        cpuSpeed = 0;
    }

    // methods
    void setCpuSpeed ( double _cpuSpeed ) {
        cpuSpeed = _cpuSpeed;
    }

    double getCpuSpeed () {
        return cpuSpeed;
    }
}

class Tablet05 extends Computer05 {
    // variables
    private double screenSize;  // in inches

    // methods
    void setScreenSize ( double _screenSize ) {
        screenSize = _screenSize;
    }

    double getScreenSize () {
        return screenSize;
    }
}

public class Example05 {
    public static void main(String[] args) {
        Tablet05 myTab = new Tablet05();
        myTab.setCpuSpeed( 2.5 );  // inherited method
        myTab.setScreenSize( 10 );
        System.out.println( myTab.getCpuSpeed() ); // inherited method
        System.out.println( myTab.getScreenSize() );
    }
}
