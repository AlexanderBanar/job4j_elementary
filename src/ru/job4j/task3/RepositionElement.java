package ru.job4j.task3;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String replacement = list.remove(list.size() - 1);
        if (!(index < 0) && !(index >= list.size())) {
            list.set(index, replacement);
        }
        return list;
    }
}
