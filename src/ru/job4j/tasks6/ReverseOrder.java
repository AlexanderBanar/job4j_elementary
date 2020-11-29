package ru.job4j.tasks6;

import java.util.Comparator;

public class ReverseOrder {
    public static Comparator<String> reverseOrder() {
        Comparator<String> rsl = Comparator.reverseOrder();
        return rsl;
    }
}
