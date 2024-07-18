package modern.challenge;

public class Main {

    public static void main(String[] args) {

        Function f = new Function(50);

        int r = f.yMinusX(10, 30);
        System.out.println("r=" + r);

        // throws IndexOutOfBoundsException
        //int r2 = f.yMinusX(30,20);

        int r3 = f.checkIndexSize(75,75);
        System.out.println("r3=" + r3);


    }

}
