package ru.job4j.tasks;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int counter = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                counter++;
                if (counter == number) {
                    rsl = i;
                    break;
                }
            }
        }
        return rsl;
    }
}
