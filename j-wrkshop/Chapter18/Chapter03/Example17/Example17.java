class Container17 {
    int c = 17;
    public void print() {
        System.out.println("This is an outer class");
    }
}

class Example17 {
    public static void main(String[] args) {

        // inner class
        Container17 container = new Container17() {
            @Override
            public void print() {
                System.out.println("This is an inner class");
            }
        };

        container.print();
        System.out.println( container.c );
    }
}
