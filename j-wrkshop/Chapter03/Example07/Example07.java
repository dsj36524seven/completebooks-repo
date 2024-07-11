class Computer07 {
    public static void whatIsIt() {
        System.out.println( "it is a PC");
    }
}

class Tablet07 extends Computer07 {
    public static void whatIsIt() {
        System.out.println( "it is a tablet");
    }
}

class Example07 {
    public static void main(String[] args) {
        Computer07 myTab = new Tablet07();
        myTab.whatIsIt();
    }
}
