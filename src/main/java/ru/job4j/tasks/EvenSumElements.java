package ru.job4j.tasks;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        if (sum % 2 != 0) {
            rsl = false;
        }
        return rsl;
    }
}
