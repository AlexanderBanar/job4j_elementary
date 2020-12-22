package ru.job4j.task3;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String rsl = "";
        if (!list.isEmpty()) {
            rsl = list.get(0);
        }
        return rsl;
    }
}
