package ru.job4j.tasks2;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                counter++;
            }
        }
        int[] rsl = new int[data.length - counter];
        counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0 && counter < rsl.length) {
                rsl[counter++] = data[i];
            }
        }
        return rsl;
    }
}
