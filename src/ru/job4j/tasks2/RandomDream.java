package ru.job4j.tasks2;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        if (num > prizes.length) {
            while (num > prizes.length) {
                num -= prizes.length;
            }
        }
        return prizes[num - 1];
    }
}
