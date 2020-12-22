package ru.job4j.tasks6;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySet {
    public static Set<String> sort(List<String> list) {
        Set<String> set = new TreeSet<>(list);
        return set;
    }
}
