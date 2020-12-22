package ru.job4j.tasks;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) < array.length) {
                if (array[i + 1] == array[i] || array[i + 1] == (array[i] + 1)) {
                    counter++;
                } else {
                    counter = 1;
                }
            }
        }
        return counter;
    }
}
