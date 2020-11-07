package ru.job4j.tasks;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int index = data.length - 1;
        int[] rsl = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            rsl[i] = data[i][index--];
        }
        return rsl;
    }
}
