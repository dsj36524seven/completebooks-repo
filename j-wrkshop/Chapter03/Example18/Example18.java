/**
* <H1>Anonymous class example</H1>
* This example shows the declaration of an <b>inner class</b> extending
* an existing class and overriding a method. It can be used as a
* technique to modify an existing method for something more suitable
* to our purpose.
*
* @author Joe Smith
* @version 0.1
* @since 20190305
*/
class Container18 {
    int c = 17;
    public void print() {
        System.out.println("This is an outer class");
    }
}

public class Example18 {
    public static void main(String[] args) {
        // inner class
        Container18 container = new Container18() {
            @Override
            public void print() {
                System.out.println("This is an inner class");
            }
        };

        container.print();
        System.out.println( container.c );
    }
}
