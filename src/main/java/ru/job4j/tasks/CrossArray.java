package ru.job4j.tasks;

/*
Заданы два числовых массива.

Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
 */

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int temp = 0;
        for (int i = 0; i < left.length; i++) {
            temp = left[i];
            for (int j = 0; j < right.length; j++) {
                if (temp == right[j]) {
                    System.out.println(temp);
                }
            }
        }
    }
}
