package ru.job4j.task3;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (!list.contains(el)) {
            return list.subList(0, 0);
        }
        int counter = 0;
        for (String temp : list) {
            if (temp.equals(el)) {
                counter++;
            }
        }
        if (counter == 1) {
            return list.subList(0, 0);
        } else {
            return list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
    }
}
