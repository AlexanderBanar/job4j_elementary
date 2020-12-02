package ru.job4j.tasks7;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        boolean isPresent = max(data).isPresent();
        if (isPresent) {
            System.out.println("Max: " + max(data).get());
        } else {
            System.out.print("");
        }
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> rsl = Optional.empty();
        if (data.length == 0) {
            return rsl;
        } else {
            Arrays.sort(data);
            rsl = Optional.of(data[data.length - 1]);
            return rsl;
        }
    }
}
