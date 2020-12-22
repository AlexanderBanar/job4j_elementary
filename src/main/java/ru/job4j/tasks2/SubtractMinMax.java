package ru.job4j.tasks2;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int sum = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                min = ints[0];
                max = ints[0];
            } else {
                if (ints[i] < min) {
                    min = ints[i];
                }
                if (ints[i] > max) {
                    max = ints[i];
                }
            }
            if (i == ints.length - 1) {
                sum = max - min;
            }
        }
        return sum;
    }
}
