package ru.job4j.tasks;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int size = data.length;
        int counter = 0;
        int[] rsl = new int[size * size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rsl[counter++] = data[i][j];
            }
        }
        return rsl;
    }
}
