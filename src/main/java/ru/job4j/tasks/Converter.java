package ru.job4j.tasks;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter++;
            }
        }
        int size = (int) Math.ceil(Math.sqrt(counter));
        int[][] rsl = new int[size][size];
        int[] temp = new int[counter];
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (counter < temp.length) {
                    temp[counter++] = array[i][j];
                }
            }
        }
        counter = 0;
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                if (counter < temp.length) {
                    rsl[i][j] = temp[counter++];
                }
            }
        }
        return rsl;
    }
}
