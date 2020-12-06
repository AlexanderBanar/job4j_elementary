package ru.job4j.task9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }
}
