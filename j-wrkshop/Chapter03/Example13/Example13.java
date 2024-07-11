class Computer13 {
    @Deprecated
    public void whatIsIt() {
        System.out.println( "it is a PC");
    }

    public void getDeviceType() {
        System.out.println( "it is a PC");
    }
}

class Tablet13 extends Computer13 {
    @Override
    public void whatIsIt() {
        System.out.println( "it is a tablet");
    }
}

class Example13 {
    public static void main(String[] args) {
        Tablet13 myTab = new Tablet13();
        myTab.whatIsIt();
        Computer13 computer13 = new Computer13();
        computer13.whatIsIt(); // hover over the method call

    }
}
