package ru.job4j.tasks6;

import java.util.Comparator;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        Comparator<String> rsl = Comparator.nullsFirst(Comparator.naturalOrder());
        return rsl;
    }
}
