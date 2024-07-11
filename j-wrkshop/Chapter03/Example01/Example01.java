class Computer01 {
    // variables
    double cpuSpeed;  // in GHz

    // constructor
    Computer01() {
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

public class Example01 {
    public static void main(String[] args) {
        Computer01 myPC = new Computer01();
        myPC.setCpuSpeed( 2.5 );
        System.out.println( myPC.getCpuSpeed() );
    }
}
