package ru.job4j.tasks2;

public class NumberToArray {
    public static int[] resolve(int number) {
        String temp = String.valueOf(number);
        int[] rsl = new int[temp.length()];
        int counter = 0;
        for (int i = rsl.length - 1; i != -1; i--) {
            if (counter < rsl.length) {
                rsl[counter++] = temp.charAt(i) - '0';
            }
        }
        return rsl;
    }
}
