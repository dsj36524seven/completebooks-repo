class Computer12 {
    public void whatIsIt() {
        System.out.println( "it is a PC");
    }
}

class Tablet12 extends Computer12 {
    @Override
    public void whatIsIt() {
        System.out.println( "it is a tablet");
    }
}

class Example12 {
    public static void main(String[] args) {
        Tablet12 myTab = new Tablet12();
        myTab.whatIsIt();
    }
}
