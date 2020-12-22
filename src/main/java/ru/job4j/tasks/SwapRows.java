package ru.job4j.tasks;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int size = data[src].length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = temp;
        }
    }
}
