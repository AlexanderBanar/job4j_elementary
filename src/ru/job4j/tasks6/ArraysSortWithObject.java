package ru.job4j.tasks6;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
