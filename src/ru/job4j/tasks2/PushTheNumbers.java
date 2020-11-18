package ru.job4j.tasks2;

import java.util.Arrays;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int size = array.length;
        int[] temp = new int[size];
        temp = Arrays.copyOf(array[row], size);
        for (int i = column + 1; i < size; i++) {
            array[row][i] = temp[i - 1];
        }
        for (int i = 0; i < column ; i++) {
            if (i < array[row].length) {
                array[row][i] = temp[i + 1];
            }
        }
        for (int i = 0; i < size; i++) {
            temp[i] = array[i][column];
        }
        for (int i = row + 1; i < size; i++) {
            array[i][column] = temp[i - 1];
        }
        for (int i = 0; i < row; i++) {
            array[i][column] = temp[i + 1];
        }
        array[row][column] = 0;
    }
}
