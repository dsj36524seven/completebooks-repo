class Computer02 {
    // variables
    private double cpuSpeed;  // in GHz

    // constructor
    Computer02() {
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

public class Example02 {
    public static void main(String[] args) {
        Computer02 myPC = new Computer02();
        myPC.setCpuSpeed( 2.5 );
        System.out.println( myPC.getCpuSpeed() );
        //System.out.println(myPC.cpuSpeed);
    }
}
