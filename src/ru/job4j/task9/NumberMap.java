package ru.job4j.task9;

import java.util.List;
import java.util.stream.Collectors;

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
