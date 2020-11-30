package ru.job4j.tasks7;

import java.util.function.Function;

public class FunctionPow {
    public static double calculate(double x) {
        Function<Double, Double> function = y -> y * y;
        return calculate(function, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
