package ru.job4j.tasks2;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        boolean rsl = true;
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                counter++;
            }
        }
        if (counter >= data.length / 2) {
            rsl = false;
        }
        return rsl;
    }
}
