public class Example21 {
    public static void main(String[] args) {

        final String VALUE = "The value is ";

        var s = new String("Hello");
        System.out.println(VALUE + s);

        var i = Integer.valueOf("42");
        System.out.println(VALUE + i);

    }
}
