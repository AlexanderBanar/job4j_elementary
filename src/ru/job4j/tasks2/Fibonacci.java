package ru.job4j.tasks2;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 2; i < data.length - 2; i++) {
            if (data[i] != (data[i - 1] + data[i - 2])) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
