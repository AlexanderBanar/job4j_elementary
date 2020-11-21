package ru.job4j.task3;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        boolean check = true;
        int sum = data.get(0);
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                check = false;
                break;
            } else {
                sum += data.get(i);
            }
        }
        sum += data.get(data.size() - 1);
        if (check) {
            return sum;
        } else {
            return 0;
        }
    }
}
