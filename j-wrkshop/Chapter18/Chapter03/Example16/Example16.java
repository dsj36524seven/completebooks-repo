class Container16 {

    // inner class
    private class Continent {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    // method to give access to the private inner class' method
    void printContinent() {
        Continent continent = new Continent();
        continent.print();
    }
}

class Example16 {
    public static void main(String[] args) {
        Container16 container = new Container16();
        container.printContinent();
    }
}
