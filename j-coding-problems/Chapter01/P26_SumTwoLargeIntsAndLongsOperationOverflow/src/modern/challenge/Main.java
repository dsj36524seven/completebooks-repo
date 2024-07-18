package modern.challenge;

import java.math.BigInteger;
import java.util.function.BinaryOperator;

import static java.lang.Math.addExact;

public class Main {

    public static void main(String[] args) {

        long x = Integer.MAX_VALUE;
        long y = Integer.MAX_VALUE;

        long z = x + y;
        System.out.println(x + " + " + y + " via '+' operator is: " + z);

        long zSum = Long.sum(x, y);
        System.out.println(x + " + " + y + " via Integer.sum() is: " + zSum);

        // throw ArithmeticException
        //int zExact = Math.addExact(x, y);
        BigInteger zExact = BigInteger.valueOf(addExact(x, y));
        System.out.println(x + " + " + y + " via Math.addExact() is: " + zExact);

        // throw ArithmeticException
        BinaryOperator<Long> operator = Math::addExact;
        long zExactBo = operator.apply(x, y);
        System.out.println(x + " + " + y + " via BinaryOperator is: " + zExactBo);
    }
}
