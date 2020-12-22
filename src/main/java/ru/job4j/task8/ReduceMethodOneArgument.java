package ru.job4j.task8;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        Integer result = list.stream().reduce((x, y) -> x * y).get();
        return result;
    }
}
