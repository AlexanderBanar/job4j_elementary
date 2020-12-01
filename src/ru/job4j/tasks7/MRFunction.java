package ru.job4j.tasks7;

import java.util.function.Function;

public class MRFunction {
    public static Function<Double, Double> apply() {
        Function<Double, Double> function = Math::sqrt;
        return function;
    }
}
