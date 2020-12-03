package ru.job4j.task8;

import java.util.List;

public class ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        Integer rsl = list.stream().reduce(5, (x, y) -> x * y);
        return rsl;
    }
}
