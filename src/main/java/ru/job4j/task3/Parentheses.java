package ru.job4j.task3;

public class Parentheses {
    public static boolean valid(char[] data) {
        if (data.length % 2 != 0 || data[0] == ')') {
            return false;
        }
        int counter = 0;
        for (char temp : data) {
            if (temp == '(') {
                counter++;
            } else {
                counter--;
            }
        }
        return counter == 0;
    }
}
