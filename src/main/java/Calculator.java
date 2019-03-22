import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Calculator {

    public int add(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new NegativeNumberException();
        }

        return a + b;
    }


    public int doubleValue(int o, int b) {

        if (o % 2 == 1 || b % 2 == 1) {
            throw new EvenException();
        }
        return o * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int subtraction(int a, int b) {
        return a - b;

    }

    public static class NegativeNumberException extends RuntimeException {
    }

    public class EvenException extends RuntimeException {
    }

    public int add2(int a, int b) {
        return a + b;
    }


    public double calculateTax(double value) {

        double procent = 0;
        if (value < 85000) {
            procent = value * 0.18;
        }
        if (value > 85000) {
            procent = value * 0.32;
        }
        return procent;
    }


}
