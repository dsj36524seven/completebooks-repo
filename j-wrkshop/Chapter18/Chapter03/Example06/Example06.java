class Computer06 {
    public void whatIsIt() {
        System.out.println( "it is a PC");
    }
}

class Tablet06 extends Computer06 {
    public void whatIsIt() {
        System.out.println( "it is a tablet");
    }
}

class Example06 {
    public static void main(String[] args) {

        Tablet06 myTab = new Tablet06();
        Computer06 myTab2 = new Tablet06();
        // Tablet06 myTab3 = new Computer06(); // invalid

        myTab.whatIsIt();
        myTab.whatIsIt();
    }
}
