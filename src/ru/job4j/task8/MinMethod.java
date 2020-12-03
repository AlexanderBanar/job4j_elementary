package ru.job4j.task8;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        Comparator<String> comparator = Comparator.naturalOrder();
        String rsl = list.stream().min(comparator).get();
        return rsl;
    }
}
