package ru.job4j.tasks;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rsl = new int[size][size];
        int counter = 0;
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                if (counter < array.length) {
                    rsl[i][j] = array[counter++];
                }
            }
        }
        return rsl;
    }
}
