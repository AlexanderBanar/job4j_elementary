package ru.job4j.task3;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>();
        list.add(first);
        int sum = list.get(0);
        for (int i = 1; i < count; i++) {
            list.add(list.get(i - 1) * denominator);
            sum += list.get(i);
        }
        return sum;
    }
}
