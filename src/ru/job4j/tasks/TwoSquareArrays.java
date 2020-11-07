package ru.job4j.tasks;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int size = left.length;
        int[] rsl = new int[size * size];
        int counter = 0;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < right.length; j++) {
                rsl[counter++] = Math.max(left[i][j], right[i][j]);
            }
        }
        return rsl;
    }
}
