package ru.job4j.task3;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
            return left.indexOf(str);
        } else if (left.contains(str)) {
            return left.indexOf(str);
        } else if (right.contains(str)) {
            return right.indexOf(str);
        }
        return -1;
    }
}
