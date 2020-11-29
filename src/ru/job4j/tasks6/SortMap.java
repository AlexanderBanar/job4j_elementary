package ru.job4j.tasks6;

import java.util.*;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        List<Integer> values = new ArrayList<>(map.keySet());
        Comparator<Integer> comparator = Comparator.reverseOrder();
        values.sort(comparator);
        Map<Integer, String> rsl = new HashMap<>();
        for (Integer n : values) {
            rsl.putIfAbsent(n, map.get(n));
        }
        return rsl;
    }
}
