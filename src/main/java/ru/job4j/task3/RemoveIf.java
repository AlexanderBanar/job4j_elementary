package ru.job4j.task3;

import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(x -> x.length() < 5);
        return list;
    }
}
