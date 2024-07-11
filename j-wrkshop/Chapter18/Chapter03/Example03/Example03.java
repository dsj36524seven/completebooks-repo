class Computer03 {
    // variables
    private double cpuSpeed;  // in GHz

    // constructor
    Computer03() {
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

public class Example03 {
    public static void main(String[] args) {
        Computer01 myPC = new Computer01();
        myPC.setCpuSpeed( 2.5 );
        System.out.println( myPC.cpuSpeed );
    }
}
