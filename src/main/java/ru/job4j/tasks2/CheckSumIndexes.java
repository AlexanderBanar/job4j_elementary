package ru.job4j.tasks2;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    counter++;
                }
            }
        }
        int[] rsl = new int[counter];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0 && index < rsl.length) {
                    rsl[index++] = data[i][j];
                }
            }
        }
        return rsl;
    }
}
