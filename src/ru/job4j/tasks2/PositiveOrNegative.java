package ru.job4j.tasks2;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean rsl = false;
        int numPos = 0;
        int numNeg = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                numPos++;
            } else {
                numNeg++;
            }
        }
        if (numNeg % 2 != 0) {
            rsl = true;
        }
        if (numPos % 2 == 0) {
            rsl = false;
        }
        return rsl;
    }
}
